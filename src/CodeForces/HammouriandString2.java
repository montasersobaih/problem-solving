package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HammouriandString2 {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        String str1 = b.readLine();

        if (str1.length() % 2 == 1) {
            System.out.println("NO");
        } else {
            char[] c1 = str1.toCharArray();
            int[] x = new int[26];

            for (int i = 0; i < c1.length; i++) {
                x[c1[i] - 'a']++;
            }

            Arrays.sort(x);

            if (x[x.length - 1] > (c1.length / 2)) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}