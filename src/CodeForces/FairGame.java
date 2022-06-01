package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962786258874
 * @link https://codeforces.com/problemset/problem/864/A
 * @since 01-06-2022
 */


public class FairGame {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] freq = new int[101];

        int max1 = 0, max2 = 0, index1 = -1, index2 = -1;
        int cards = Integer.parseInt(reader.readLine());
        for (int i = 0; i < cards; i++) {
            int num = Integer.parseInt(reader.readLine());

            freq[num]++;
            if (freq[num] >= max1) {
                max2 = max1;
                index2 = index1;

                max1 = freq[num];
                index1 = num;
            } else if (freq[num] >= max2) {
                max2 = freq[num];
                index2 = num;
            }
        }

        if (max1 + max2 == cards) {
            System.out.printf("YES\n%d %d", index1, index2);
        } else {
            System.out.println("NO");
        }
    }
}