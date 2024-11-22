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
 * @link <a href="https://judge.beecrowd.com/en/problems/view/1589">Bob Conduit</a>
 * @algorithm
 * @since 09-11-2022
 */

class BobConduitSolution1 {

    public static void main(String[] args) throws IOException {
        Queue<String> cases = new LinkedList<>();

        try (Reader reader = new InputStreamReader(System.in)) {
            BufferedReader bReader = new BufferedReader(reader);

            int tc = Integer.parseInt(bReader.readLine());
            while (tc-- > 0) {
                cases.add(bReader.readLine());
            }
        }

        try (Writer writer = new OutputStreamWriter(System.out)) {
            PrintWriter pWriter = new PrintWriter(writer);

            while (!cases.isEmpty()) {
                StringTokenizer tokenizer = new StringTokenizer(cases.poll());

                int r1 = Integer.parseInt(tokenizer.nextToken());
                int r2 = Integer.parseInt(tokenizer.nextToken());

                pWriter.println(r1 + r2);
            }
        }
    }
}

class BobConduitSolution2 {

    public static void main(String[] args) throws IOException {
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pWriter = new PrintWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(bReader.readLine());
        while (tc-- > 0) {
            StringTokenizer tokenizer = new StringTokenizer(bReader.readLine());

            int r1 = Integer.parseInt(tokenizer.nextToken());
            int r2 = Integer.parseInt(tokenizer.nextToken());

            pWriter.println(r1 + r2);
        }

        pWriter.flush();
    }
}