package AhmedAly;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Cryptography {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String small = "abcdefghijklmnopqrstuvwxyz", capital = small.toUpperCase();

        int loop = Integer.parseInt(b.readLine());
        while (loop-- > 0) {
            StringTokenizer tokenizer = new StringTokenizer(b.readLine());
            int n = Integer.parseInt(tokenizer.nextToken()), m = Integer.parseInt(tokenizer.nextToken());
            tokenizer = new StringTokenizer(b.readLine());

            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < n; i++) {
                char[] seq = tokenizer.nextToken().toCharArray();
                for (int j = 0; j < seq.length; j++) {
                    char ch = seq[j];
                    if (Character.isLetter(ch)) {
                        if (Character.isUpperCase(ch)) {
                            int index = ch - 'A', newindex = (index + m) % 26;
                            seq[j] = Character.toLowerCase(capital.charAt(newindex));
                        } else {
                            int index = ch - 'a', newindex = (index + m) % 26;
                            seq[j] = Character.toUpperCase(small.charAt(newindex));
                        }
                    }
                }
                builder.append(new String(seq)).append(" ");
            }
            builder.trimToSize();
            System.out.println(builder);
        }
    }
}
