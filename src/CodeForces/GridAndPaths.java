package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962-786258874
 * @link
 * @algorithm
 * @since 09-11-2022
 */

public class GridAndPaths {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int tc = parseInt(reader.readLine());
        while (tc-- > 0) {
            int col = parseInt(reader.readLine());
            String l1 = reader.readLine();
            String l2 = reader.readLine();

            int blocking = 0;
            for (int i = 0; i < col - 1; i += 2) {
                boolean block = true;
                if (l1.charAt(i) != '.' || l1.charAt(i + 1) != '.' || l2.charAt(i) != '.' || l2.charAt(i + 1) != '.') {
                    block = false;
                    i--;
                }

                if (block) {
                    blocking++;
                }
            }

            System.out.println(blocking);
        }
    }
}