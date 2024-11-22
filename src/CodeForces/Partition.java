package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962786258874
 * @link https://codeforces.com/group/MUjDsRjHXt/contest/302066/problem/H
 * @since 01-06-2022
 */

public class Partition {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(reader.readLine());
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int pos = 0, neg = 0;
        while (tokenizer.hasMoreTokens()) {
            int n = Integer.parseInt(tokenizer.nextToken());
            if (n > 0) {
                pos += n;
            } else {
                neg += n;
            }
        }

        System.out.println(pos - neg);
    }
}