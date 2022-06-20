package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962786258874
 * @link https://codeforces.com/problemset/problem/38/B
 * @since 01-06-2022
 */


public class Chess {

    private static int[] xAxis = {2, 2, -2, -2, 1, 1, -1, -1};
    private static int[] yAxis = {1, -1, 1, -1, 2, -2, 2, -2};

    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        String rook = b.readLine();
        String knight = b.readLine();

        int result = count(rook, knight);
        System.out.println(result);
    }

    private static int count(String rook, String knight) {
        int[][] board = new int[8][8];


        int X = rook.charAt(0) - 'a';
        int Y = rook.charAt(1) - '1';
        for (int i = 0; i < 8; i++) {
            board[X][i] = board[i][Y] = 1;

            int x = X + xAxis[i], y = Y + yAxis[i];
            if (x >= 0 && x < 8 && y >= 0 && y < 8) {
                board[x][y] = 1;
            }
        }

        X = knight.charAt(0) - 'a';
        Y = knight.charAt(1) - '1';
        board[X][Y] = 1;
        for (int i = 0; i < 8; i++) {
            int x = X + xAxis[i], y = Y + yAxis[i];
            if (x >= 0 && x < 8 && y >= 0 && y < 8) {
                board[x][y] = 1;
            }
        }

        int squares = 0;
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                if (board[x][y] == 0) {
                    squares++;
                }
            }
        }

        return squares;
    }
}