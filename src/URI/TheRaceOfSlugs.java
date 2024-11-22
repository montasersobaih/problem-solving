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
import java.util.StringTokenizer;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962-786258874
 * @link <a href="https://judge.beecrowd.com/en/problems/view/1789">The Race of Slugs</a>
 * @algorithm
 * @since 09-11-2022
 */

public class TheRaceOfSlugs {

    public static void main(String[] args) throws IOException {
        Queue<String> cases = new LinkedList<>();

        try (Reader reader = new InputStreamReader(System.in)) {
            BufferedReader bReader = new BufferedReader(reader);

            while (bReader.readLine() != null) {
                cases.offer(bReader.readLine());
            }
        }

        try (Writer writer = new OutputStreamWriter(System.out)) {
            PrintWriter pWriter = new PrintWriter(writer);

            while (!cases.isEmpty()) {
                StringTokenizer tokenizer = new StringTokenizer(cases.poll());

                int level = 1;
                while (tokenizer.hasMoreTokens()) {
                    int code = Integer.parseInt(tokenizer.nextToken());
                    if (level < 2 && code >= 10 && code < 20) {
                        level = 2;
                    } else if (code >= 20) {
                        level = 3;
                        break;
                    }
                }

                pWriter.println(level);
            }
        }
    }
}