package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.StringTokenizer;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962-786258874
 * @link <a href="https://judge.beecrowd.com/en/problems/view/1149">Summing Consecutive Integers</a>
 * @algorithm
 * @since 09-11-2022
 */

public class SummingConsecutiveIntegers {

    public static void main(String[] args) throws IOException {
        Reader reader = new InputStreamReader(System.in);
        BufferedReader bReader = new BufferedReader(reader);
        StringTokenizer tokenizer = new StringTokenizer(bReader.readLine());

        try (PrintWriter pWriter = new PrintWriter(System.out)) {
            int x = Integer.parseInt(tokenizer.nextToken());
            while (tokenizer.hasMoreTokens()) {
                int n = Integer.parseInt(tokenizer.nextToken());
                if (n <= 0) {
                    continue;
                }

                int inc = x, sum = 0;
                for (int i = 1; i <= n; i++) {
                    sum += inc;
                    inc++;
                }

                pWriter.println(sum);
            }
        }
    }
}
