package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @link https://codeforces.com/problemset/problem/112/A
 * @since 29-03-2022
 */

public class PetyaAndStrings {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine().toLowerCase();
        String str1 = reader.readLine().toLowerCase();

        System.out.println((str.compareTo(str1) < 0) ? -1 : (str.compareTo(str1) == 0) ? 0 : 1);

        reader.close();
        System.exit(0);
    }
}
