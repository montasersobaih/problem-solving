package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AbdelkaderandMountains {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String str1 = b.readLine();
        char[] in = str1.toCharArray();
        char[] out = str1.toCharArray();

        int up = 0;
        for (int i = 0; i < out.length; i++) {
            if (out[i] == '?') {
                out[i] = '/';
            }

            if (out[i] == '/') {
                up++;
            } else if (out[i] == '\\') {
                up--;
            }
        }
        for (int i = (out.length - 1); i >= 0 && up != 0; i--) {
            if (in[i] == '?') {
                if (up == 1) {
                    out[i] = '_';
                    up = 0;
                } else {
                    out[i] = '\\';
                    up -= 2;
                }
            }
        }
        System.out.println(new String(out));
    }
}
