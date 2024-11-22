package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.StringJoiner;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962-786258874
 * @link <a href="https://codeforces.com/contest/118/problem/B">B. Present from Lena</a>
 * @algorithm Constructive algorithms / Implementation
 * @since 09-11-2022
 */

public class PresentFromLena {

    public static void main(String[] args) throws Exception {
        Reader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        int length = Integer.parseInt(reader.readLine()) * 2 + 1;
        int mid = length / 2;

        StringJoiner joiner = new StringJoiner("\n");
        for (int i = 0; i < length; i++) {
            int distance = Math.max(i - mid, 0) * 2;
            int left = mid - i + distance;
            int right = mid + i - distance;

            StringJoiner builder = new StringJoiner(" ");
            for (int j = 0; j < length; j++) {
                if (j >= left && j <= right) {
                    int intervalMid = (right - left) / 2;

                    for (int k = 0; j++ <= right; k++) {
                        int distance2 = Math.max(k - intervalMid, 0) * 2;
                        builder.add(String.valueOf(k - distance2));
                    }

                    break;
                } else {
                    builder.add(" ");
                }
            }

            joiner.add(builder.toString());
        }

        System.out.println(joiner);
    }
}
