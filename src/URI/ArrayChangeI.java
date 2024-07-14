package URI;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962-786258874
 * @link <a href="https://judge.beecrowd.com/en/problems/view/1175">Array Change I</a>
 * @algorithm
 * @since 09-11-2022
 */

public class ArrayChangeI {

    public static void main(String[] args) {
        int[] n = new int[20];

        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < n.length; i++) {
                n[n.length - 1 - i] = scanner.nextInt();
            }
        }

        try (PrintWriter pWriter = new PrintWriter(System.out)) {
            for (int i = 0; i < n.length; i++) {
                pWriter.printf("N[%d] = %d\n", i, n[i]);
            }
        }
    }
}
