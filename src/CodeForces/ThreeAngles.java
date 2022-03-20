package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ThreeAngles {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        int loop = Integer.parseInt(b.readLine());
        while (loop-- > 0) {
            String[] x = b.readLine().split(" ");
            int[] y = {Integer.parseInt(x[0]), Integer.parseInt(x[1]), Integer.parseInt(x[2])};
            System.out.println((y[0] > 0 && y[0] < 180 &&
                    y[1] > 0 && y[1] < 180 &&
                    y[2] > 0 && y[2] < 180 &&
                    (y[0] + y[1] + y[2] == 180)) ? "YES" : "NO");
        }
    }
}