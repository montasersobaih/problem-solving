package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962786258874
 * @link https://codeforces.com/group/MUjDsRjHXt/contest/302066/problem/J
 * @since 01-06-2022
 */

class TeamsFormingSolution1 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(reader.readLine());
        int[] n = new int[length];

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < length; i++) {
            n[i] = Integer.parseInt(tokenizer.nextToken());
        }

        Arrays.sort(n);

        int sum = 0;
        for (int i = 0; i < length; i += 2) {
            sum += (n[i + 1] - n[i]);
        }

        System.out.println(sum);
    }
}
