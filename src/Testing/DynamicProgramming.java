package Testing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;


public class DynamicProgramming {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("Input.txt"));
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> words = new HashSet<String>();
        HashMap<String, String> declare = new HashMap<String, String>();

        int noOfWords = Integer.parseInt(reader.readLine());
        while (noOfWords-- > 0) {
            words.add(reader.readLine());
        }

        StringBuilder builder = new StringBuilder(reader.readLine().concat("\n"));
        StringBuilder needFix = new StringBuilder();

        StringTokenizer tokenizer = null;
        String line = null;
        while ((line = reader.readLine()) != null) {
            builder.append(line.concat("\n"));
            tokenizer = new StringTokenizer(line.replaceAll("[^a-z0-9]", " "));
            while (tokenizer.hasMoreTokens()) {
                String token = tokenizer.nextToken();
                if (!words.contains(token)) {
                    declare.put(token, tokenizer.nextToken());
                } else if (token.equals("cout")) {
                    while (!words.contains(token = tokenizer.nextToken())) {
                        if (declare.remove(token) == null) {
                            needFix.append(token.concat(" "));
                        }
                    }
                }
            }
        }

        Iterator<String> ptr = declare.keySet().iterator();
        tokenizer = new StringTokenizer(needFix.toString());
        while (tokenizer.hasMoreTokens() && ptr.hasNext()) {
            String search = ptr.next();
            String init = " = ".concat(declare.get(search));
            search += init;
            String replace = tokenizer.nextToken().concat(init);

            int start = builder.indexOf(search);
            builder.replace(start, start + search.length(), replace);
        }

        System.out.print(builder);
    }
}
