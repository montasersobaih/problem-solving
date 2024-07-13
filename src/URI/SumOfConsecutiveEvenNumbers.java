package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962-786258874
 * @link <a href="https://judge.beecrowd.com/en/problems/view/1159">Sum of Consecutive Even Numbers</a>
 * @algorithm
 * @since 09-11-2022
 */

public class SumOfConsecutiveEvenNumbers {

    public static void main(String[] args) throws IOException {
        Reader reader = new InputStreamReader((System.in));
        BufferedReader bReader = new BufferedReader(reader);

        try (PrintWriter pWriter = new PrintWriter(System.out)) {
            int x;
            while ((x = Integer.parseInt(bReader.readLine())) != 0) {
                x = (x % 2 != 0) ? ++x : x;

                long sum = 0;
                int loop = 5;
                while (loop-- > 0) {
                    sum += x;
                    x += 2;
                }

                pWriter.println(sum);
            }
        }
    }
}
