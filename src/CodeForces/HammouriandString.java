package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class HammouriandString {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        String str1 = b.readLine();

        if (str1.length() % 2 == 1) {
            System.out.println("NO");
        } else {
            char[] c1 = str1.toCharArray();

            if (isDublicate(c1)) {
                int dublicate = countDublicate(c1), length = c1.length / 2;

                if (dublicate > length) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES\n" + new String(makeString(c1)));
                }
            } else {
                System.out.println("YES\n" + str1);
            }
        }

    }

    public static boolean isDublicate(char[] c1) {
        char[] c2 = new StringBuilder(new String(c1)).reverse().toString().toCharArray();
        int length = c1.length;
        for (int i = 0; i < length; i++) {
            if (c1[i] == c2[i]) {
                return true;
            }
        }
        return false;
    }

    public static int countDublicate(char[] c1) {
        HashMap<Character, Integer> hash = new HashMap();

        char[] c2 = new StringBuilder(new String(c1)).reverse().toString().toCharArray();

        for (int i = 0; i < c1.length; i++) {
            if (hash.get(c1[i]) != null) {
                hash.put(c1[i], hash.get(c1[i]) + 1);
            } else {
                hash.put(c1[i], 1);
            }
        }

        int max = 0;
        char s = '0';
        for (Character c : hash.keySet()) {
            if (hash.get(c) > max) {
                max = hash.get(c);
                s = c;
            }
        }
        return max;
    }

    public static char[] makeString(char[] c1) {
        int length = c1.length;
        char[] c2 = c1;
        Arrays.sort(c2);

        for (int i = 0; i < length - 1; i++) {
            if (c2[i] == c2[i + 1]) {

                c2 = getDeffirent(c2[i + 1], c2, i + 1);
            }
        }
        return c2;
    }

    public static char[] getDeffirent(char c, char[] c1, int j) {
        for (int i = j; i < c1.length; i++) {
            if (c1[i] != c) {
                char ch = c1[j];
                c1[j] = c1[i];
                c1[i] = ch;
                return c1;
            }
        }
        return c1;
    }

}