package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Word {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        char[] ch = b.readLine().toCharArray();
        int upper = 0, lower = 0;
        for (int i = 0; i < ch.length; i++) {
            if (Character.isUpperCase(ch[i])) {
                upper++;
            } else {
                lower++;
            }
        }
        System.out.println((upper > lower) ? new String(ch).toUpperCase() : new String(ch).toLowerCase());
    }
}