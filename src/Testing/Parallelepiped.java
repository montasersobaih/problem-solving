package Testing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Parallelepiped {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        while (tokenizer.hasMoreTokens()) {
            int token = parseInt(tokenizer.nextToken());

            if (token > max) {
                max = token;
            }

            if (token < min) {
                min = token;
            }
        }

        System.out.println((long) (Math.ceil(Math.sqrt(min)) * 8 + Math.ceil(Math.sqrt(max)) * 4));
    }

    private static int parseInt(String convert) {
        return Integer.parseInt(convert);
    }
}
