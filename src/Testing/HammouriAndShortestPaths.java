package Testing;

import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

import static java.lang.Integer.parseInt;

public class HammouriAndShortestPaths {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String[] x = b.readLine().split(" ");
        char[][] y = new char[parseInt(x[0])][parseInt(x[1])];
        boolean[][] bl = new boolean[y.length][y[0].length];
        for (int i = 0; i < y.length; i++) {
            y[i] = b.readLine().toCharArray();
        }

        int q = 0;
        int w = 0;
        int[] i = {0, 1, 0, -1};
        int[] j = {1, 0, -1, 0};
        ArrayDeque<Point> ar = new ArrayDeque<Point>();
        ar.offer(new Point(q, w));
        boolean is = false;
        while (!is) {
            is = false;
            for (int k = 0; k < i.length; k++) {
                Point p = ar.getLast();
                int p1 = (int) p.getX() + i[k], p2 = (int) p.getY() + j[k];
                if (p1 >= 0 && p1 < y.length && p2 >= 0 && p2 < y[0].length) {
                    if (y[p1][p2] != 'X' && !bl[p1][p2]) {
                        is = true;
                        ar.offer(new Point(p1, p2));
                    }
                }
            }
        }
    }
}