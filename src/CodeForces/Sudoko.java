package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sudoko {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        int loop = Integer.parseInt(b.readLine());
        while (loop-- > 0) {
            char[][] x = new char[9][9];
            for (int i = 0; i < x.length; i++) {
                x[i] = b.readLine().toCharArray();
            }
            System.out.println((check(x)) ? "Valid" : "Invalid");
            b.readLine();
        }
    }

    public static boolean check(char[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                char c = x[i][j];
                x[i][j] = '0';

                for (int k = 0; k < x.length; k++) {
                    if (x[i][k] == c) {
                        return false;
                    }

                    if (x[k][j] == c) {
                        return false;
                    }
                }

                int length1 = (i < 3) ? 3 : (i < 6) ? 6 : 9,
                        length2 = (j < 3) ? 3 : (j < 6) ? 6 : 9,
                        a = (i < 3) ? 0 : (i < 6) ? 3 : 6,
                        b = (j < 3) ? 0 : (j < 6) ? 3 : 6;

                for (int k = a; k < length1; k++) {
                    for (int l = b; l < length2; l++) {
                        if (x[k][l] == c) {
                            return false;
                        }
                    }
                }
                x[i][j] = c;
            }
        }

        return true;
    }
}