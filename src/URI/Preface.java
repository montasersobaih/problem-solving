package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.StringTokenizer;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962-786258874
 * @link <a href="https://judge.beecrowd.com/en/problems/view/1837">Preface</a>
 * @algorithm
 * @since 09-11-2022
 */

public class Preface {

    public static void main(String[] args) throws IOException {
        int a, b;
        try (Reader reader = new InputStreamReader(System.in)) {
            BufferedReader bReader = new BufferedReader(reader);
            StringTokenizer tokenizer = new StringTokenizer(bReader.readLine());
            a = Integer.parseInt(tokenizer.nextToken());
            b = Integer.parseInt(tokenizer.nextToken());
        }

        try (Writer writer = new OutputStreamWriter(System.out)) {
            PrintWriter pWriter = new PrintWriter(writer);

            int r = a % b;
            r = (r < 0) ? r + Math.abs(b) : r;
            int q = (a - r) / b;

            pWriter.printf("%d %d\n", q, r);
        }
    }
}
