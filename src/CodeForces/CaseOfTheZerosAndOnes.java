package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @link https://codeforces.com/problemset/problem/37/A
 * @since 29-03-2022
 */

public class CaseOfTheZerosAndOnes {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(reader.readLine());
        String str = reader.readLine();

        int[] x = {0, 0};
        for (int i = 0; i < loop; i++) {
            x[str.charAt(i) - '0']++;
        }
        System.out.println(Math.abs(x[0] - x[1]));
    }
}