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
 * @link <a href="https://judge.beecrowd.com/en/problems/view/1158">Sum of Consecutive Odd Numbers III</a>
 * @algorithm
 * @since 09-11-2022
 */

public class SumOfConsecutiveOddNumbersIII {

    public static void main(String[] args) throws IOException {
        Reader reader = new InputStreamReader(System.in);
        BufferedReader bReader = new BufferedReader(reader);

        try (PrintWriter pWriter = new PrintWriter(System.out)) {
            int tc = Integer.parseInt(bReader.readLine());
            while (tc-- > 0) {
                StringTokenizer tokenizer = new StringTokenizer(bReader.readLine());
                int x = Integer.parseInt(tokenizer.nextToken());
                int y = Integer.parseInt(tokenizer.nextToken());
                x = (x % 2 == 0) ? ++x : x;

                int sum = 0;
                while (y-- > 0) {
                    sum += x;
                    x += 2;
                }

                pWriter.println(sum);
            }
        }
    }
}
