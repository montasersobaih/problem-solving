package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962-786258874
 * @link <a href="https://judge.beecrowd.com/en/problems/view/1557">Square Matrix III</a>
 * @algorithm
 * @since 09-11-2022
 */

class SquareMatrixIIISolution1 {

    public static void main(String[] args) throws IOException {
        Queue<Byte> cases = new LinkedList<>();

        try (Reader reader = new InputStreamReader(System.in)) {
            BufferedReader bReader = new BufferedReader(reader);

            String line;
            while (!(line = bReader.readLine()).equals("0")) {
                cases.offer(Byte.parseByte(line));
            }
        }

        try (PrintWriter pWriter = new PrintWriter(System.out)) {
            while (!cases.isEmpty()) {
                byte n = cases.poll();
                int maxPower = n * 2 - 1;
                int numOfSpaces = String.format("%.0f", Math.pow(2, maxPower - 1)).length();

                String format = String.join("", "%", Integer.toString(numOfSpaces), ".0f");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        double result = Math.pow(2, i + j);
                        pWriter.printf(format, result);
                        if (j + 1 != n) {
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

class SquareMatrixIIISolution2 {

    private static final String[] spaces = {
            "%1d", "%1d", "%2d", "%2d", "%3d",
            "%4d", "%4d", "%5d", "%5d", "%6d",
            "%7d", "%7d", "%8d", "%8d", "%9d"
    };

    public static void main(String[] args) throws IOException {
        Queue<Byte> cases = new LinkedList<>();

        try (Reader reader = new InputStreamReader(System.in)) {
            BufferedReader bReader = new BufferedReader(reader);

            String line;
            while (!(line = bReader.readLine()).equals("0")) {
                cases.offer(Byte.parseByte(line));
            }
        }

        try (PrintWriter pWriter = new PrintWriter(System.out)) {
            while (!cases.isEmpty()) {
                byte n = cases.poll();

                int num = 1;
                for (int i = 0; i < n; i++) {
                    int result = num;
                    for (int j = 0; j < n; j++) {
                        pWriter.printf(spaces[n - 1], result);
                        result *= 2;
                        if (j + 1 != n) {
                            pWriter.print(" ");
                        }
                    }
                    num *= 2;
                    pWriter.println();
                }
                pWriter.println();
            }
        }
    }
}
