package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PalindromicTimes {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String[] str1 = b.readLine().split(":");
        String str2;
        int x = Integer.parseInt(str1[0]), y = Integer.parseInt(str1[1]);
        do {
            if ((y = ++y % 60) == 0) {
                if ((x = ++x % 24) == 0) {
                    System.out.println("00:00");
                    return;
                }
            }
            str2 = String.format("%02d%02d", x, y);
        } while (!str2.equals(new StringBuilder(str2).reverse().toString()));
        System.out.println(str2.substring(0, 2) + ":" + str2.substring(2, 4));
    }
}