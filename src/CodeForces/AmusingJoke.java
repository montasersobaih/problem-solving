package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @link https://codeforces.com/problemset/problem/141/A
 * @since 29-03-2022
 */

public class AmusingJoke {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        char[] ch = reader.readLine().concat(reader.readLine()).toCharArray();
        char[] ch1 = reader.readLine().toCharArray();

        Arrays.parallelSort(ch);
        Arrays.parallelSort(ch1);

        System.out.println((new String(ch).equals(new String(ch1))) ? "YES" : "NO");

        reader.close();
        System.exit(0);
    }
}
