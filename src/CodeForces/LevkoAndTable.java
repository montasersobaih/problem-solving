package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LevkoAndTable {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String[] x = b.readLine().split(" ");
        int length = Integer.parseInt(x[0]), y = Integer.parseInt(x[1]);
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(((i == j) ? y : 0) + " ");
            }
            System.out.println();
        }
    }
}