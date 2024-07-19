package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962-786258874
 * @link <a href="https://judge.beecrowd.com/en/problems/view/1541">Building Houses</a>
 * @algorithm
 * @since 09-11-2022
 */

public class BuildingHouses {

    public static void main(String[] args) throws IOException {
        Queue<String> cases = new LinkedList<>();

        try (Reader reader = new InputStreamReader(System.in)) {
            BufferedReader bReader = new BufferedReader(reader);

            String line;
            while (!(line = bReader.readLine()).equals("0")) {
                cases.offer(line);
            }
        }

        try (PrintWriter pWriter = new PrintWriter(System.out)) {
            while (!cases.isEmpty()) {
                StringTokenizer tokenizer = new StringTokenizer(cases.poll());

                short a = Short.parseShort(tokenizer.nextToken());
                short b = Short.parseShort(tokenizer.nextToken());
                short c = Short.parseShort(tokenizer.nextToken());

                int result = (int) Math.sqrt((a * b * 100.0 / c));

                pWriter.println(result);
            }
        }
    }
}
