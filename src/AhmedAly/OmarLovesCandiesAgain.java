package AhmedAly;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OmarLovesCandiesAgain {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(b.readLine());
        while (loop-- > 0) {
            char[] c = b.readLine().toCharArray();
            char ch = 'a';
            int[] x = new int[26];
            int max = 0;

            for (int i = 0; i < c.length; i++) {
                if (++x[c[i] - 'a'] > max) {
                    max = x[c[i] - 'a'];
                    ch = c[i];
                }
            }

            for (int i = 0; i < x.length; i++) {
                if (x[i] == max) {
                    if ((char) (i + 'a') < ch) {
                        ch = (char) (i + 'a');
                    }
                }
            }
            System.out.println(max + " " + ch);
        }
    }
}