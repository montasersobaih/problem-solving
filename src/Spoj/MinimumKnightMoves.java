package Spoj;
//Minnimum Knight Moves

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class MinimumKnightMoves {
    private static int[] xAxis = {1, 2, 2, 1, -1, -2, -2, -1}, yAxis = {-2, -1, 1, 2, 2, 1, -1, -2};
    private static String[] move = {"L", "R", "U", "D", "LU", "LD", "RU", "RD"};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        String alph = "abcdefgh";

        for (int i = 0; i < t; i++) {
            StringTokenizer token = new StringTokenizer(reader.readLine());
            String start = token.nextToken(), end = token.nextToken();
            int startX = alph.indexOf(start.charAt(0)), startY = Integer.parseInt(String.valueOf(start.charAt(1))) - 1;
            int endX = alph.indexOf(end.charAt(0)), endY = Integer.parseInt(String.valueOf(end.charAt(1))) - 1;
            System.out.println(bfs(startX, startY, endX, endY));
        }
    }

    public static int bfs(int startX, int startY, int endX, int endY) {
        Stack<State> q = new Stack<State>();
        boolean[][] board = new boolean[8][8];

        q.push(new State(startX, startY, 0));
        board[startX][startY] = true;

        while (!q.isEmpty()) {
            State state = q.pop();
            if (state.x == endX && state.y == endY) {
                return state.move;
            }
            for (int i = 0; i < 8; i++) {
                int nextX = state.x + xAxis[i], nextY = state.y + yAxis[i];
                if (nextX >= 0 && nextX <= 7 && nextY >= 0 && nextY <= 7) {
                    if (!board[nextX][nextY]) {
                        q.push(new State(nextX, nextY, state.move + 1));
                        board[nextX][nextY] = true;
                    }
                }
            }

        }
        return 0;
    }


    private static class State {
        int x, y, move;

        public State(int x, int y, int move) {
            this.x = x;
            this.y = y;
            this.move = move;
        }
    }
}