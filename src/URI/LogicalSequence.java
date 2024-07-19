package URI;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962-786258874
 * @link <a href="https://judge.beecrowd.com/en/problems/view/1144">Logical Sequence</a>
 * @algorithm
 * @since 09-11-2022
 */

public class LogicalSequence {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        try (PrintWriter pWriter = new PrintWriter(System.out)) {
            int counter = 1;
            for (int i = 0; i < n * 2; i++) {
                double square = Math.pow(counter, 2);
                double cubic = Math.pow(counter, 3);

                if (i % 2 == 0) {
                    pWriter.printf("%d %.0f %.0f\n", counter, square, cubic);
                } else {
                    pWriter.printf("%d %.0f %.0f\n", counter, square + 1, cubic + 1);
                    counter++;
                }
            }
        }
    }
}
