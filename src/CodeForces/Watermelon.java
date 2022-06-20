package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @link https://codeforces.com/group/MUjDsRjHXt/contest/302066/problem/F
 * @since 29-03-2022
 */

public class Watermelon {

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int weight = Integer.parseInt(bf.readLine());
        if (weight % 2 == 0 && weight != 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}