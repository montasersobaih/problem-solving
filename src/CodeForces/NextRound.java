package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NextRound {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String[] x = b.readLine().split(" ");
        int elements = Integer.parseInt(x[0]), mid = Integer.parseInt(x[1]), count = 0, e;
        x = b.readLine().split(" ");
        for (int i = 0; i < elements; i++) {
            if ((e = Integer.parseInt(x[i])) > 0 && e >= Integer.parseInt(x[mid - 1])) {
                count++;
            }
        }
        System.out.println(count);
    }
}