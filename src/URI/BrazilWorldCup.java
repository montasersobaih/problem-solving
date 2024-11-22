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
     * @link <a href="https://judge.beecrowd.com/en/problems/view/1564">Brazil World Cup</a>
 * @algorithm
 * @since 09-11-2022
 */

public class BrazilWorldCup {

    public static void main(String[] args) throws IOException {
        Queue<String> cases = new LinkedList<>();

        try (Reader reader = new InputStreamReader(System.in)) {
            BufferedReader bReader = new BufferedReader(reader);

            String line;
            while ((line = bReader.readLine()) != null) {
                cases.add(line);
            }
        }

        try (Writer writer = new OutputStreamWriter(System.out)) {
            PrintWriter pWriter = new PrintWriter(writer);

            while (!cases.isEmpty()) {
                int n = Integer.parseInt(cases.poll());
                if (n == 0) {
                    pWriter.println("vai ter copa!");
                } else {
                    pWriter.println("vai ter duas!");
                }
            }
        }
    }
}
