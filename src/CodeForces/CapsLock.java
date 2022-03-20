package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CapsLock {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String str = b.readLine();
        for (int i = 1; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                System.out.println(str);
                return;
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                System.out.print(Character.toLowerCase(str.charAt(i)));
            } else {
                System.out.print(Character.toUpperCase(str.charAt(i)));
            }
        }
    }
}