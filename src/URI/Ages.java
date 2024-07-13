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
 * @link <a href="https://judge.beecrowd.com/en/problems/view/1154">Ages</a>
 * @algorithm
 * @since 09-11-2022
 */

public class Ages {

    public static void main(String[] args) throws IOException {
        Reader reader = new InputStreamReader(System.in);
        BufferedReader bReader = new BufferedReader(reader);

        int counter = 0, sum = 0, parsedValue;
        while ((parsedValue = Integer.parseInt(bReader.readLine())) >= 0) {
            counter++;
            sum += parsedValue;
        }

        System.out.printf("%.2f\n", sum * 1.0 / counter);
    }
}
