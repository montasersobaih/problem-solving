package AhmedAly;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BalloonsColors {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(b.readLine());
        while (loop-- > 0) {
            String[] x = b.readLine().split(" "), y = b.readLine().split(" ");

            if (y[0].equals(x[1]) && y[y.length - 1].equals(x[2])) {
                System.out.println("BOTH");
            } else if (y[0].equals(x[1])) {
                System.out.println("EASY");
            } else if (y[y.length - 1].equals(x[2])) {
                System.out.println("HARD");
            } else {
                System.out.println("OKAY");
            }
        }
    }
}