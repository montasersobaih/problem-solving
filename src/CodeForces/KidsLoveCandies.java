package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.StringTokenizer;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962-786258874
 * @link <a href="https://codeforces.com/gym/100155/problem/D">D. Kids Love Candies</a>
 * @algorithm Math
 * @since 09-11-2022
 */

public class KidsLoveCandies {

    public static void main(String[] args) throws Exception {
        Reader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        StringTokenizer tokenizer;

        tokenizer = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(tokenizer.nextToken());

        int count = 0;
        tokenizer = new StringTokenizer(reader.readLine());
        while (tokenizer.hasMoreTokens()) {
            count += Integer.parseInt(tokenizer.nextToken()) / k;
        }

        System.out.println(count);
    }
}
