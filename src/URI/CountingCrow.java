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
 * @link <a href="https://judge.beecrowd.com/en/problems/view/1848">Counting Crow</a>
 * @algorithm
 * @since 30-11-2024
 */

public class CountingCrow {

    private static final int[] digits = {4, 2, 1};

    public static void main(String[] args) throws IOException {
        Queue<String> lines = new LinkedList<>();

        try (Reader reader = new InputStreamReader(System.in)) {
            BufferedReader bReader = new BufferedReader(reader);

            String line;
            while ((line = bReader.readLine()) != null) {
                lines.offer(line);
            }
        }

        try (Writer writer = new OutputStreamWriter(System.out)) {
            PrintWriter pWriter = new PrintWriter(writer);

            int result = 0;
            while (!lines.isEmpty()) {
                String input = lines.poll();

                if (input.charAt(0) != 'c') {
                    for (int i = 0; i < digits.length; i++) {
                        if (input.charAt(i) == '*') {
                            result += digits[i];
                        }
                    }
                } else {
                    pWriter.println(result);
                    result = 0;
                }
            }
        }
    }
}
