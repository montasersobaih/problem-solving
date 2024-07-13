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
 * @link <a href="https://judge.beecrowd.com/en/problems/view/1151">Easy Fibonacci</a>
 * @algorithm
 * @since 09-11-2022
 */

public class EasyFibonacci {

    public static void main(String[] args) throws IOException {
        Reader reader = new InputStreamReader(System.in);
        BufferedReader bReader = new BufferedReader(reader);

        try (PrintWriter pWriter = new PrintWriter(System.out)) {
            int fNumber = Integer.parseInt(bReader.readLine());

            pWriter.print(0);

            int previous = 0, current = 1;
            while (--fNumber > 0) {
                pWriter.append(" ");
                pWriter.print(current);

                current = current + previous;
                previous = current - previous;
            }

            pWriter.println();
        }
    }
}
