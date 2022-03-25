package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathOfTheKing {

    private static int[] xAxis = {1, 1, 1, 0, -1, -1, -1, 0};

    private static int[] yAxis = {1, 0, -1, -1, -1, 0, 1, 1};

    private static String[] move = {"RU", "R", "RD", "D", "LD", "L", "LU", "U"};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String start = reader.readLine(), end = reader.readLine();
        int startX = start.charAt(0) - 'a', startY = start.charAt(1) - '1';
        int endX = end.charAt(0) - 'a', endY = end.charAt(1) - '1';

        System.out.println(bfs(startX, startY, endX, endY));
    }

    public static String bfs(int startX, int startY, int endX, int endY) {
        Queue<State> q = new LinkedList<>();
        boolean[][] board = new boolean[8][8];

        q.offer(new State(startX, startY, 0, ""));
        board[startX][startY] = true;

        while (!q.isEmpty()) {
            State state = q.poll();

            if (state.x == endX && state.y == endY) {
                return state.count + "\n" + state.move;
            }

            for (int i = 0; i < 8; i++) {
                int nextX = state.x + xAxis[i], nextY = state.y + yAxis[i];
                if (nextX >= 0 && nextX <= 7 && nextY >= 0 && nextY <= 7) {
                    if (!board[nextX][nextY]) {
                        q.offer(new State(nextX, nextY, state.count + 1, state.move + move[i] + "\n"));
                        board[nextX][nextY] = true;
                    }
                }
            }
        }

        return "";
    }

    private static class State {

        protected int x, y, count;

        protected String move;

        public State(int x, int y, int count, String move) {
            this.x = x;
            this.y = y;
            this.count = count;
            this.move = move;
        }
    }
}