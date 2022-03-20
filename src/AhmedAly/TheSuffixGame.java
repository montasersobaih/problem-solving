package AhmedAly;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TheSuffixGame {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(reader.readLine());
        for (int i = 1; i <= tc; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            String first = tokenizer.nextToken(), second = tokenizer.nextToken();

            int flength = first.length(), slength = second.length();
            while (flength-- > 1 && slength-- > 1) {
                if (first.charAt(flength - 1) != second.charAt(slength - 1)) {
                    break;
                }
            }

            System.out.printf("Game #%d:\n", i);
            System.out.printf("   The input words are %s and %s.\n", first.trim(), second);
            System.out.printf("   The words entered in the notebook are %s and %s.\n",
                    first.substring(0, flength).trim(), second.substring(0, slength));
        }
    }
}