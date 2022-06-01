package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @link https://codeforces.com/problemset/problem/313/A
 * @since 29-03-2022
 */

public class IlyaAndBankAccount {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();

        long min = Integer.parseInt(number);
        int max = Integer.parseInt(number.substring(1));

        if (min < 0) {
            byte last = Byte.parseByte(number.substring(number.length() - 1));
            byte before = Byte.parseByte(number.substring(number.length() - 2, number.length() - 1));
            if (max > 100) {
                if (last > before) {
                    System.out.print(number.substring(0, number.length() - 1));
                } else {
                    for (int i = 0; i < number.length(); i++) {
                        System.out.print((i == number.lastIndexOf(number.charAt(number.length() - 2))) ? "" : number.charAt(i));
                    }
                    System.out.println();
                }
            } else {
                if (last == 0)
                    System.out.println(0);
                else if (last > before)
                    System.out.print(number.substring(0, number.length() - 1));
                else {
                    for (int i = 0; i < number.length(); i++) {
                        System.out.print((i == number.lastIndexOf(number.charAt(number.length() - 2))) ? "" : number.charAt(i));
                    }
                    System.out.println();
                }
            }
        } else {
            System.out.println(number);
        }
    }
}