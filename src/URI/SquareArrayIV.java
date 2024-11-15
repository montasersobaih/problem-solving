package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962-786258874
 * @link <a href="https://judge.beecrowd.com/en/problems/view/1827">Square Array IV</a>
 * @algorithm
 * @since 09-11-2022
 */

public class SquareArrayIV {

    public static void main(String[] args) throws IOException {
        Queue<String> cases = new LinkedList<>();

        try (Reader reader = new InputStreamReader(System.in)) {
            BufferedReader bReader = new BufferedReader(reader);

            String line;
            while ((line = bReader.readLine()) != null) {
                cases.offer(line);
            }
        }

        try (Writer writer = new OutputStreamWriter(System.out)) {
            PrintWriter pWriter = new PrintWriter(writer);

            while (!cases.isEmpty()) {
                int n = Integer.parseInt(cases.poll());
                int ips = n / 3, ipsRows = n - ips * 2;
                int[] diagonal = new int[n];


                diagonal[0] = 2;
                diagonal[n - 1] = 3;
                for (int i = 0; i < ips; i++) {
                    for (int j = 0; j < n; j++) {
                        pWriter.print(diagonal[j]);
                    }
                    pWriter.println();

                    diagonal[i + 1] = diagonal[i];
                    diagonal[n - 2 - i] = diagonal[n - 1 - i];
                    diagonal[i] = diagonal[n - 1 - i] = 0;
                }

                for (int i = 0; i < ipsRows; i++) {
                    for (int j = 0; j < ips; j++) {
                        pWriter.print(0);
                    }

                    for (int j = ips; j < n - ips; j++) {
                        if (i == ipsRows / 2 && j == n / 2) {
                            pWriter.print(4);
                        } else {
                            pWriter.print(1);
                        }
                    }

                    for (int j = 0; j < ips; j++) {
                        pWriter.print(0);
                    }
                    pWriter.println();
                }

                do {
                    diagonal[ips - 1] = 3;
                    diagonal[n - ips] = 2;
                    diagonal[ips] = diagonal[n - ips - 1] = 0;

                    for (int j = 0; j < n; j++) {
                        pWriter.print(diagonal[j]);
                    }
                    pWriter.println();
                } while (--ips > 0);

                pWriter.println();
            }
        }
    }
}
