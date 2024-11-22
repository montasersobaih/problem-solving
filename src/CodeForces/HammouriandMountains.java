package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HammouriandMountains {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader b = new BufferedReader(new FileReader("Input"));
        char[] c = b.readLine().toCharArray();

        double sum = 0, up = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '/') {
                up++;
                sum += (up - 0.5);
            } else if (c[i] == '\\') {
                up--;
                sum += (up + 0.5);
            } else if (up > 0) {
                if (c[i] == '_') {
                    sum += up;
                }
            }
        }
        System.out.println((long) sum);
    }
}