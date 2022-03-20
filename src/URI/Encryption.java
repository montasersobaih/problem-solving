package URI;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Encryption {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(b.readLine());
        while (loop-- > 0) {
            char[] ch = b.readLine().toCharArray();
            for (int i = 0; i < ch.length; i++) {
                if (i <= (ch.length - 1) / 2) {
                    if (Character.isLetter(ch[i])) {
                        ch[i] += 2;
                    } else {
                        ch[i] -= 1;
                    }
                } else {
                    if (Character.isLetter(ch[i])) {
                        ch[i] += 3;
                    }
                }
            }
            System.out.println(new StringBuilder(new String(ch)).reverse());
        }
    }
}