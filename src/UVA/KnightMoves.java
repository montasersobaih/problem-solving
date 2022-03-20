package UVA;
//Knight Moves

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class KnightMoves {
    private static int[] xAxis = new int[]{1, 2, 2, 1, -1, -2, -2, -1};
    private static int[] yAxis = new int[]{-2, -1, 1, 2, 2, 1, -1, -2};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String alpha = "abcdefgh";
        String s;
        while ((s = reader.readLine()) != null) {
            StringTokenizer str = new StringTokenizer(s);
            String start = str.nextToken(), end = str.nextToken();
            int startX = alpha.indexOf(start.charAt(0)), startY = Integer.parseInt(String.valueOf(start.charAt(1))) - 1;
            int endX = alpha.indexOf(end.charAt(0)), endY = Integer.parseInt(String.valueOf(end.charAt(1))) - 1;
            System.out.printf("To get from %s to %s takes %d knight moves.\n", start, end, bfs(startX, startY, endX, endY));
        }
    }

    public static int bfs(int startX, int startY, int endX, int endY) {
        Queue<State> q = new ArrayDeque<State>();
        boolean[][] board = new boolean[8][8];
        q.offer(new State(startX, startY, 0));
        board[startX][startY] = true;
        while (!q.isEmpty()) {
            State state = q.poll();
            if (state.x == endX && state.y == endY) {
                return state.count;
            }
            for (int i = 0; i < 8; i++) {
                int nextX = state.x + xAxis[i], nextY = state.y + yAxis[i];
                if (nextX >= 0 && nextX <= 7 && nextY >= 0 && nextY <= 7) {
                    if (!board[nextX][nextY]) {
                        q.offer(new State(nextX, nextY, state.count + 1));
                        board[nextX][nextY] = true;
                    }
                }
            }
        }
        return 0;
    }

    private static class State {
        int x, y, count;

        public State(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }
}