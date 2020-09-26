package URI;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int loop = s.nextInt();
        while (loop-- > 0) {
            int x = s.nextInt();
            if (x % 2 != 0 && x < 0) {
                System.out.println("ODD NEGATIVE");
            } else if (x % 2 == 0 && x < 0) {
                System.out.println("EVEN NEGATIVE");
            } else if (x % 2 == 0 && x == 0) {
                System.out.println("NULL");
            } else if (x % 2 != 0 && x > 0) {
                System.out.println("ODD POSITIVE");
            } else if (x % 2 == 0 && x > 0) {
                System.out.println("EVEN POSITIVE");
            }
        }
    }
}