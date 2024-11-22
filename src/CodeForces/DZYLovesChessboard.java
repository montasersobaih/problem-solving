package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DZYLovesChessboard {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String[] x = b.readLine().split(" ");
        char[][] c = new char[Integer.parseInt(x[0])][Integer.parseInt(x[1])];
        for (int i = 0; i < c.length; i++) {
            c[i] = b.readLine().toCharArray();
            for (int j = 0; j < c[i].length; j++) {
                if (c[i][j] == '.') {
                    c[i][j] = ((i + j) % 2 == 0) ? 'B' : 'W';
                }
            }
        }
        for (char[] c1 : c) {
            System.out.println(new String(c1));
        }
    }
}