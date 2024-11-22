package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @link https://codeforces.com/group/MUjDsRjHXt/contest/302066/problem/L
 * @since 29-03-2022
 */

public class StringTask {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine().toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (!"aoyeui".contains(Character.toString(str.charAt(i)))) {
                System.out.print("." + str.charAt(i));
            }
        }

        System.out.println();
    }
}