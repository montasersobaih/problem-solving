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
 * @link <a href="https://judge.beecrowd.com/en/problems/view/1172">Array Replacement I</a>
 * @algorithm
 * @since 09-11-2022
 */

public class ArrayReplacementI {

    public static void main(String[] args) throws IOException {
        Reader reader = new InputStreamReader(System.in);
        BufferedReader bReader = new BufferedReader(reader);

        for (int i = 0; i < 10; i++) {
            String line = bReader.readLine();
            int number = Integer.parseInt(line);
            System.out.printf("X[%d] = %d\n", i, number <= 0 ? 1 : number);
        }
    }
}