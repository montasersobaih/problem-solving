package Testing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PageNumbering {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader reader = new BufferedReader(new FileReader("Test.txt"));
        StringTokenizer tokenizer = null;

        int tc = Integer.parseInt(reader.readLine());
        while (tc-- > 0) {
            tokenizer = new StringTokenizer(reader.readLine());
            int n = Integer.parseInt(tokenizer.nextToken());
            int m = Integer.parseInt(tokenizer.nextToken());

            tokenizer = new StringTokenizer(reader.readLine());
            int max = 0;
            for (int i = 0; i < m; i++) {
                int token = Integer.parseInt(tokenizer.nextToken());
                if (token > max) {
                    max = token;
                }
            }

            System.out.println(((max - n + 1) > 1) ? max - n + 1 : 1);
        }
    }
}
