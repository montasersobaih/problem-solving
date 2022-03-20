package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SaitamaDestroysHotel {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String[] x = b.readLine().split(" ");
        int n = Integer.parseInt(x[0]), s = Integer.parseInt(x[1]);
        while (n-- > 0) {
            x = b.readLine().split(" ");
            int n1 = Integer.parseInt(x[0]), n2 = Integer.parseInt(x[1]);
            s = Math.max(s, n1 + n2);
        }
        System.out.println(s);
    }
}