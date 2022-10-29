package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringJoiner;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962786258874
 * @link https://codeforces.com/problemset/problem/454/A
 * @since 01-06-2022
 */

class LittlePonyAndCrystalMineSolution1 {

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

class LittlePonyAndCrystalMineSolution2 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();
        int length = Integer.parseInt(line);
        int mid = length / 2;

        StringJoiner joiner = new StringJoiner("\n");
        for (int i = 0; i < length; i++) {
            int distance = Math.max(i - mid, 0) * 2;
            StringBuilder builder = new StringBuilder();
            for (int j = 0; j < length; j++) {
                builder.append(j >= mid - i + distance && j <= mid + i - distance ? "D" : "*");
            }
            joiner.add(builder.toString());
        }

        System.out.println(joiner);
    }
}