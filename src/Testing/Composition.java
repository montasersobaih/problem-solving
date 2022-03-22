package Testing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Composition {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("To Exit 'Please Type \"END\"'");
        System.out.println("Enter Set's ======> Ex: s1 = {x/y, w/z, ....}");
        HashMap<String, String> hash = new HashMap<String, String>();
        String str, theComposition;
        while (!(str = b.readLine()).equals("END")) {
            str = str.replace(" ", "");
            String key = str.substring(0, str.indexOf('=')), value = str.substring(str.indexOf('=') + 1);
            hash.put(key, value);
        }

        System.out.println("Enter The Composition ========> Ex: s1 s2 s3 ....");
        StringTokenizer token = new StringTokenizer(b.readLine());
        theComposition = hash.get(token.nextToken());
        while (token.hasMoreTokens()) {
            String str3 = hash.get(token.nextToken()).replaceAll("[{}]", "").replace(",", " ");
            StringTokenizer token2 = new StringTokenizer(str3);
            while (token2.hasMoreTokens()) {
                String[] x = token2.nextToken().split("/");
                theComposition = theComposition.replace(x[1], x[0]);
            }
        }
        System.out.printf("The Composition Is: %s%n", theComposition);
    }
}