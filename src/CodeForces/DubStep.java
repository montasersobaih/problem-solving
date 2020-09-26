package CodeForces;

import java.util.Scanner;

public class DubStep {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[] x = s.next().replace("WUB", " ").toCharArray();

        String a = "";
        for (int i = 0; i < x.length - 1; i++) {
            if (x[i] == ' ' && x[i + 1] == ' ') {
                continue;
            } else {
                a += x[i];
            }
        }

        a += x[x.length - 1];
        char[] str = (a).toCharArray();

        if (str[0] == ' ' && str[str.length - 1] == ' ') {
            String sre = "";
            for (int i = 0; i < str.length; i++)
                sre += str[i];
            System.out.println(sre.trim());
            System.exit(0);
        } else if (str[0] == ' ') {
            int c = 0;
            for (int i = 0; str[i] == ' '; i++) {
                c++;
            }

            String sre = "";
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

            String sre = "";
            for (int i = 0; i < str.length - c; i++) {
                System.out.print(str[i]);
            }

            System.out.println();
            System.exit(0);
        } else {
            for (int i = 0; i < str.length; i++) {
                System.out.print(str[i]);
            }
            System.out.println();
        }
    }
}