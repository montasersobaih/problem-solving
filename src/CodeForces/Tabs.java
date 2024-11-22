package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

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

public class Tabs {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int tc = parseInt(reader.readLine());
        while (tc-- > 0) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int N = parseInt(tokenizer.nextToken());
            int S = parseInt(tokenizer.nextToken());
            int T = parseInt(tokenizer.nextToken());

            long moves;
            if (S < T) {
                moves = ((T - S) / 3) + ((T - S) % 3);
            } else {
                moves = ((N - S + T) / 3) + ((N - S + T) % 3);
            }

            System.out.println(moves);
        }
    }
}
