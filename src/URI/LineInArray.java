package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962-786258874
 * @link <a href="https://judge.beecrowd.com/en/problems/view/1181">Line in Array</a>
 * @algorithm
 * @since 09-11-2022
 */

public class LineInArray {

    public static void main(String[] args) throws IOException {
        int lineNumber;
        String operation;
        double result = 0d;

        try (Reader reader = new InputStreamReader(System.in)) {
            BufferedReader bReader = new BufferedReader(reader);

            lineNumber = Integer.parseInt(bReader.readLine());
            operation = bReader.readLine();

            for (int i = 0; i < lineNumber * 12; i++) {
                bReader.readLine();
            }

            for (int j = 0; j < 12; j++) {
                result += Double.parseDouble(bReader.readLine());
            }

            System.out.printf("%.1f\n", operation.equals("S") ? result : result / 12);
        }
    }
}
