package CodeForces;

import java.util.Scanner;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962786258874
 * @link https://codeforces.com/problemset/problem/208/A
 * @since 01-06-2022
 */


public class DubStep {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[] x = s.next().replace("WUB", " ").toCharArray();

        String a = "";
        for (int i = 0; i < x.length - 1; i++) {
            if (!(x[i] == ' ' && x[i + 1] == ' ')) {
                a += x[i];
            }
        }

        a += x[x.length - 1];
        char[] str = (a).toCharArray();

        if (str[0] == ' ' && str[str.length - 1] == ' ') {
            String sre = "";
            for (char c : str) {
                sre += c;
            }

            System.out.println(sre.trim());
            System.exit(0);
        } else if (str[0] == ' ') {
            int c = 0;
            for (int i = 0; str[i] == ' '; i++) {
                c++;
            }

            for (int i = c; i < str.length; i++) {
                System.out.print(str[i]);
            }

            System.out.println();
            System.exit(0);
        } else if (str[str.length - 1] == ' ') {
            int c = 0;
            for (int i = str.length - 1; str[i] == ' '; i--) {
                c++;
            }

            for (int i = 0; i < str.length - c; i++) {
                System.out.print(str[i]);
            }

            System.out.println();
            System.exit(0);
        } else {
            for (char c : str) {
                System.out.print(c);
            }

            System.out.println();
        }
    }
}