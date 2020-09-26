package CodeForces;

import java.util.Scanner;

public class LittlePonyandCrystalMine {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        int length = s.nextInt(), K = length / 2;
        for (int i = 0; i < length; i++) {
            if (i == K) {
                builder.append("D");
            } else {
                builder.append("*");
            }
        }

        System.out.println(builder);
        for (int i = K, j = K; i > 0 && j < builder.length(); i--, j++) {
            builder.replace(i - 1, i, "D");
            builder.replace(j + 1, j + 2, "D");
            System.out.println(builder);
        }
        for (int i = 0, j = builder.length(); i < K; i++, j--) {
            builder.replace(i, i + 1, "*");
            builder.replace(j - 1, j, "*");
            System.out.println(builder);
        }
    }
}