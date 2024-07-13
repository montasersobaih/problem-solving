package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.StringTokenizer;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962-786258874
 * @link <a href="https://judge.beecrowd.com/en/problems/view/1145">Logical Sequence 2</a>
 * @algorithm
 * @since 09-11-2022
 */

public class LogicalSequence2 {

    public static void main(String[] args) throws IOException {
        Reader reader = new InputStreamReader(System.in);
        BufferedReader bReader = new BufferedReader(reader);
        StringTokenizer tokenizer = new StringTokenizer(bReader.readLine());

        int x = Integer.parseInt(tokenizer.nextToken());
        int y = Integer.parseInt(tokenizer.nextToken());

        int newLine = 0;
        try (PrintWriter pWriter = new PrintWriter(System.out)) {
            for (int i = 1; i <= y; i++) {
                pWriter.print(i);
                if ((newLine = (newLine + 1) % x) == 0) {
                    pWriter.println();
                } else {
                    pWriter.print(" ");
                }
            }
        }
    }
}
