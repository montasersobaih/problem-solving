package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @link https://codeforces.com/problemset/problem/82/A
 * @since 29-03-2022
 */

public class DoubleCola {

    private static final String[] words = {"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};

    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(b.readLine()) - 1;
        while (x > 4 && ((x = (x - 5) / 2) > 4)) ;

        System.out.println(words[x]);
    }
}