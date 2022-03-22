package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @since 20-03-2022
 */

public class MultiplicationTable {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] elm = reader.readLine().split(" ");

        int n = Integer.parseInt(elm[0]);
        int tNum = Integer.parseInt(elm[1]);

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (tNum / i <= n && tNum % i == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}