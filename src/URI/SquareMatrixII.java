package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962-786258874
 * @link <a href="https://judge.beecrowd.com/en/problems/view/1478">Square Matrix II</a>
 * @algorithm
 * @since 09-11-2022
 */

class SquareMatrixIISolution1 {

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        int length;
        while ((length = s.nextInt()) != 0) {
            int[][] ar = new int[length][length];
            for (int i = 0; i < length; i++) {
                for (int j = i, k = 1; j < length; j++, k++) {
                    ar[i][j] = ar[j][i] = k;
                }
            }

            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length; j++) {
                    System.out.printf("%3d", ar[i][j]);
                    if (j + 1 < length)
                        System.out.print(" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

class SquareMatrixIISolution2 {

    public static void main(String[] args) throws IOException {
        Queue<String> cases = new LinkedList<>();

        try (BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while (!(line = bReader.readLine()).trim().equals("0")) {
                cases.offer(line);
            }
        }

        try (PrintWriter pWriter = new PrintWriter(new OutputStreamWriter(System.out))) {
            while (!cases.isEmpty()) {
                int length = Integer.parseInt(cases.poll().trim());

                int[][] ar = new int[length][length];
                for (int i = 0; i < length; i++) {
                    int k = 1;
                    for (int j = i; j < length; j++) {
                        ar[i][j] = ar[j][i] = k++;
                    }
                }

                for (int i = 0; i < length; i++) {
                    for (int j = 0; j < length; j++) {
                        pWriter.printf("%3d", ar[i][j]);
                        if (j + 1 < length) {
                            pWriter.print(" ");
                        }
                    }
                    pWriter.println();
                }
                pWriter.println();
            }
        }
    }
}
