package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962786258874
 * @link https://codeforces.com/problemset/problem/122/A
 * @since 01-06-2022
 */


public class LuckyDivision {

    private static final int[] luckyNumbers = {4, 7, 47, 74, 477};

    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        String answer = "NO";
        int n = Integer.parseInt(b.readLine());
        for (int luckyNumber : luckyNumbers) {
            if (n % luckyNumber == 0) {
                answer = "YES";
                break;
            }
        }

        System.out.println(answer);
    }
}