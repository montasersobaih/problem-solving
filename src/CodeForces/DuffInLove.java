package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962786258874
 * @link https://codeforces.com/contest/588/problem/B
 * @since 01-06-2022
 */

public class DuffInLove {

    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        long num = Long.parseLong(b.readLine());
        for (long i = 2; i * i < num + 1; ++i) {
            if (num % (i * i) == 0) {
                num = num / i;
                i = 1;
            }
        }

        System.out.println(num);
    }
}