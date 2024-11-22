package CodeForces;

import java.util.Scanner;

public class LyaAndBankAccount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String x = s.next();
        long min = Integer.parseInt(x);
        int max = Integer.parseInt(x.substring(1));

        if (min < 0) {
            if (max > 100) {
                byte last = Byte.parseByte(x.substring(x.length() - 1));
                byte befor = Byte.parseByte(x.substring(x.length() - 2, x.length() - 1));
                if (last > befor) {
                    System.out.print(x.substring(0, x.length() - 1));
                } else {
                    for (int i = 0; i < x.length(); i++) {
                        System.out.print((i == x.lastIndexOf(x.charAt(x.length() - 2))) ? "" : x.charAt(i));
                    }
                    System.out.println();
                }
            } else {
                byte last = Byte.parseByte(x.substring(x.length() - 1));
                byte befor = Byte.parseByte(x.substring(x.length() - 2, x.length() - 1));
                if (last == 0) {
                    System.out.println(0);
                } else {
                    if (last > befor) {
                        System.out.print(x.substring(0, x.length() - 1));
                    } else {
                        for (int i = 0; i < x.length(); i++) {
                            System.out.print((i == x.lastIndexOf(x.charAt(x.length() - 2))) ? "" : x.charAt(i));
                        }
                        System.out.println();
                    }
                }
            }
        } else {
            System.out.println(x);
        }
    }
}