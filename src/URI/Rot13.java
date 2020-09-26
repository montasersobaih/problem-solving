package URI;

import java.io.BufferedReader;
import java.io.FileReader;

public class Rot13 {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new FileReader("Input"));
//        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        char[] x = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] y = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        String str = null;
        while ((str = b.readLine()) != null) {
            char[] z = str.toCharArray();

            for (int i = 0; i < z.length; i++) {
                if (Character.isUpperCase(z[i])) {
                    int n = BS(z[i], y);
                    if (n <= 12) {
                        z[i] = y[n + 13];
                    } else if (n > 12) {
                        z[i] = y[n - 13];
                    }
                } else if (Character.isLowerCase(z[i])) {
                    int n = BS(z[i], x);
                    if (n <= 12) {
                        z[i] = x[n + 13];
                    } else if (n > 12) {
                        z[i] = x[n - 13];
                    }
                }
            }
            System.out.println(new String(z));
        }
    }

    public static int BS(char ch, char[] x) {
        int first = 0, last = x.length - 1, mid = 0;

        while (first <= last) {
            mid = (first + last) / 2;

            if (ch == x[mid])
                return mid;
            else if (ch > x[mid])
                first = (mid + 1);
            else
                last = (mid - 1);
        }
        return -1;
    }
}