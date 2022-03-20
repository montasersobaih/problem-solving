package AhmedAly;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArabicAndEnglish {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(b.readLine());
        while (loop-- > 0) {
            b.readLine();
            StringBuilder builder = new StringBuilder();
            StringTokenizer token = new StringTokenizer(b.readLine());
            while (token.hasMoreTokens()) {
                String str = token.nextToken();
                if (str.contains("#")) {
                    builder.append(str).append(" ");
                } else {
                    StringBuilder builder2 = new StringBuilder();
                    while (token.hasMoreTokens()) {
                        builder2.insert(0, token.nextToken()).insert(0, " ");
                    }
                    builder.insert(0, " ").insert(0, str).insert(0, builder2.reverse());
                }
            }
            System.out.println(builder.toString().trim());
        }
    }
}