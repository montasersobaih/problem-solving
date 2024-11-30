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
 * @link <a href="https://judge.beecrowd.com/en/problems/view/1847">Welcome to the Winter!</a>
 * @algorithm
 * @since 30-11-2024
 */

public class WelcomeToTheWinter {

    public static void main(String[] args) throws IOException {
        StringTokenizer tokenizer;

        try (Reader reader = new InputStreamReader(System.in)) {
            BufferedReader bReader = new BufferedReader(reader);
            tokenizer = new StringTokenizer(bReader.readLine());
        }

        try (Writer writer = new OutputStreamWriter(System.out)) {
            PrintWriter pWriter = new PrintWriter(writer);

            int day1 = Integer.parseInt(tokenizer.nextToken());
            int day2 = Integer.parseInt(tokenizer.nextToken());
            int day3 = Integer.parseInt(tokenizer.nextToken());

            boolean areTheyHappy = false;
            if (day1 > day2) {
                if (day3 >= day2) {
                    areTheyHappy = true;
                } else {
                    areTheyHappy = day1 - day2 > day2 - day3;
                }
            } else if (day1 == day2) {
                if (day3 > day2) {
                    areTheyHappy = true;
                }
            } else {
                if (day2 - day1 <= day3 - day2) {
                    areTheyHappy = true;
                }
            }

            pWriter.println(areTheyHappy ? ":)" : ":(");
        }
    }
}
