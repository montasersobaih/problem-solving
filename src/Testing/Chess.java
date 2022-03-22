package Testing;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Chess {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String rook = b.readLine(), knight = b.readLine();
        int[][] board = new int[8][8];
        int Xaxis = rook.charAt(0) - 'a';
        int Yaxis = rook.charAt(1) - '1';
        for (int i = 0; i < 8; i++) {
            board[Xaxis][i] = 1;
            board[i][Yaxis] = 1;
        }
        int[] moveX = {2, 2, -2, -2, 1, 1, -1, -1};
        int[] moveY = {1, -1, 1, -1, 2, -2, 2, -2};
        for (int i = 0; i < 8; i++) {
            int x = Xaxis + moveX[i], y = Yaxis + moveY[i];
            if (x >= 0 && x < 8 && y >= 0 && y < 8) {
                board[x][y] = 1;
            }
        }

        Xaxis = knight.charAt(0) - 'a';
        Yaxis = knight.charAt(1) - '1';
        board[Xaxis][Yaxis] = 1;
        for (int i = 0; i < 8; i++) {
            int x = Xaxis + moveX[i], y = Yaxis + moveY[i];
            if (x >= 0 && x < 8 && y >= 0 && y < 8) {
                board[x][y] = 1;
            }
        }

        int count = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}