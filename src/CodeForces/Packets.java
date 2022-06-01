package CodeForces;

import java.util.Scanner;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962786258874
 * @link https://codeforces.com/problemset/problem/1037/A
 * @since 01-06-2022
 */


public class Packets {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int coins = scan.nextInt();
        int result = (int) (Math.log(coins) / Math.log(2));
        System.out.println(result + 1);
    }
}