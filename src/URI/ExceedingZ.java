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
 * @link <a href="https://judge.beecrowd.com/en/problems/view/1150">Exceeding Z</a>
 * @algorithm
 * @since 09-11-2022
 */

public class ExceedingZ {

    public static void main(String[] args) throws IOException {
        Reader reader = new InputStreamReader(System.in);
        BufferedReader bReader = new BufferedReader(reader);

        int x = Integer.parseInt(bReader.readLine());
        int z;
        while ((z = Integer.parseInt(bReader.readLine())) <= x);

        int count = 1, sum = x;
        while (sum <= z) {
            count++;
            sum += ++x;
        }

        System.out.println(count);
    }
}
