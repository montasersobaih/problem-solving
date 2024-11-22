package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.StringTokenizer;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962-786258874
 * @link
 * @algorithm
 * @since 09-11-2022
 */

public class PageNumbering {

    public static void main(String[] args) throws Exception {
        Reader input = new InputStreamReader(System.in);
        try (BufferedReader reader = new BufferedReader(input)) {
            StringTokenizer tokenizer;

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
}
