package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bombs {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer string = new StringTokenizer(b.readLine());
        int x = Integer.parseInt(string.nextToken());
        int y = Integer.parseInt(string.nextToken());

        char[][] c = new char[x][y];

        for (int i = 0; i < x; i++) {
            char[] c1 = b.readLine().toCharArray();
            for (int j = 0; j < y; j++) {
                c[i][j] = c1[j];
            }
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (c[i][j] == 'o') {
                    Bang(i, j, c);
                }
            }
        }

        for (int i = 0; i < c.length; i++) {
            System.out.println(new String(c[i]).replace('o', 'x'));
        }
    }

    public static void Bang(int i, int j, char[][] c1) {
        for (int k = 0; k < c1.length; k++) {
            for (int l = 0; l < c1[k].length; l++) {
                int dis = (int) Math.sqrt(Math.pow((k - i), 2) + Math.pow((l - j), 2));
                if (dis <= (3 / 2) && c1[k][l] != 'o') {
                    c1[k][l] = 'x';
                }
            }
        }
    }
}