package AhmedAly;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AnagramString {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(b.readLine());
        while (loop-- > 0) {
            char[] c1 = b.readLine().toCharArray(), c2 = b.readLine().toCharArray();
            int c = c1.length + c2.length;
            for (int j = 0; j < c1.length; j++) {
                for (int k = 0; k < c2.length; k++) {
                    if (c1[j] == c2[k]) {
                        c1[j] = '0';
                        c2[k] = '0';
                        c -= 2;
                        break;
                    }
                }
            }
            System.out.println(c);
        }
    }
}