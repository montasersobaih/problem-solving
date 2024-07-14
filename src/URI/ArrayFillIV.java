package URI;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962-786258874
 * @link <a href="https://judge.beecrowd.com/en/problems/view/1179">Array Fill IV</a>
 * @algorithm
 * @since 09-11-2022
 */

public class ArrayFillIV {

    public static void main(String[] args) throws IOException {
        int[] n = new int[15];

        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < n.length; i++) {
                n[i] = scanner.nextInt();
            }
        }

        try (PrintWriter pWriter = new PrintWriter(System.out)) {
            int[] even = new int[5], odd = new int[5];
            int eCounter = 0, oCounter = 0;

            for (int number : n) {
                if (number % 2 == 0) {
                    even[eCounter++] = number;
                } else {
                    odd[oCounter++] = number;
                }

                if (eCounter == even.length) {
                    eCounter = 0;
                    for (int j = 0; j < even.length; j++) {
                        pWriter.printf("par[%d] = %d\n", j, even[j]);
                    }
                } else if (oCounter == odd.length) {
                    oCounter = 0;
                    for (int j = 0; j < odd.length; j++) {
                        pWriter.printf("impar[%d] = %d\n", j, odd[j]);
                    }
                }
            }

            for (int i = 0; i < oCounter; i++) {
                pWriter.printf("impar[%d] = %d\n", i, odd[i]);
            }

            for (int i = 0; i < eCounter; i++) {
                pWriter.printf("par[%d] = %d\n", i, even[i]);
            }
        }
    }
}
