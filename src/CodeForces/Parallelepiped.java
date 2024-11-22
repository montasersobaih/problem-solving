package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962-786258874
 * @link <a href="https://codeforces.com/contest/224/problem/A">A. Parallelepiped</a>
 * @algorithm Brute force / Geometry / Math
 * @since 09-11-2022
 */

public class Parallelepiped {

    public static void main(String[] args) throws IOException {
        Reader input = new InputStreamReader(System.in);
        try (BufferedReader reader = new BufferedReader(input)) {
            StringTokenizer token = new StringTokenizer(reader.readLine());

            int[] edge = new int[3];

            for (int i = 0; token.hasMoreTokens(); i++) {
                edge[i] = Integer.parseInt(token.nextToken());
            }

            Arrays.sort(edge);

            int r1 = 0, r2 = 0, r3 = 0;
            for (int i = 1; i <= edge[0]; i++) {
                if (edge[0] % i == 0) {
                    r1 = edge[0] / i;
                    if (edge[2] % r1 == 0) {
                        r2 = edge[2] / r1;
                        if (edge[1] % r2 == 0) {
                            r3 = edge[1] / r2;
                            if (r3 == i) {
                                break;
                            }
                        }
                    }
                }
            }

            System.out.println(r1 * 4 + r2 * 4 + r3 * 4);
        }
    }
}