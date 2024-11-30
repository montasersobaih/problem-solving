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
 * @link <a href="https://judge.beecrowd.com/en/problems/view/1858">Theon's Answer</a>
 * @algorithm
 * @since 30-11-2024
 */

class TheonsAnswerSolution1 {

    public static void main(String[] args) throws IOException {
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pWriter = new PrintWriter(new OutputStreamWriter(System.out));

        int loop = Integer.parseInt(bReader.readLine());
        StringTokenizer tokenizer = new StringTokenizer(bReader.readLine());

        int min = Integer.parseInt(tokenizer.nextToken()), index = 0;
        for (int i = 1; i < loop; i++) {
            int n = Integer.parseInt(tokenizer.nextToken());
            if (n < min) {
                min = n;
                index = i;
            }
        }

        pWriter.println(index + 1);
        pWriter.flush();
    }
}

class TheonsAnswerSolution2 {

    public static void main(String[] args) throws IOException {
        int loop;
        StringTokenizer tokenizer;

        try (Reader reader = new InputStreamReader(System.in)) {
            BufferedReader bReader = new BufferedReader(reader);

            loop = Integer.parseInt(bReader.readLine());
            tokenizer = new StringTokenizer(bReader.readLine());
        }

        try (Writer writer = new OutputStreamWriter(System.out)) {
            PrintWriter pWriter = new PrintWriter(writer);

            int min = tokenizer.nextToken().charAt(0), index = 0;
            for (int i = 1; i < loop; i++) {
                int n = tokenizer.nextToken().charAt(0);
                if (n < min) {
                    min = n;
                    index = i;
                }
            }

            pWriter.println(index + 1);
        }
    }
}
