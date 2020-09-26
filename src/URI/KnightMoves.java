package URI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class KnightMoves {
    private static int[] xAxis = {-2, -2, -1, 1, 2, 2, 1, -1};
    private static int[] yAxis = {-1, 1, 2, 2, 1, -1, -2, -2};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        while ((line = reader.readLine()) != null) {
            StringTokenizer tokenizer = new StringTokenizer(line);

            String start = tokenizer.nextToken(), end = tokenizer.nextToken();
            int startX = start.charAt(0) - 'a', startY = start.charAt(1) - '1';
            int endX = end.charAt(0) - 'a', endY = end.charAt(1) - '1';

            int moves = BFS(startX, startY, endX, endY);
            System.out.printf("To get from %s to %s takes %d knight moves.\n", start, end, moves);
        }
    }

    private static int BFS(int startX, int startY, int endX, int endY) {
        boolean[][] visited = new boolean[8][8];

        Queue<State> queue = new LinkedList<State>();
        queue.offer(new State(startX, startY, 0));
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            State s = queue.poll();
            if (s.getX() == endX && s.getY() == endY) {
                return s.getNoOfMoves();
            } else {
                for (int i = 0; i < 8; i++) {
                    int nx = s.getX() + xAxis[i], ny = s.getY() + yAxis[i];
                    try {
                        if (!visited[nx][ny]) {
                            visited[nx][ny] = true;
                            queue.offer(new State(nx, ny, s.getNoOfMoves() + 1));
                        }
                    } catch (Exception e) {
                    }
                }
            }
        }
        return 0;
    }

    private static class State {
        private int x, y, noOfMoves;

        public State(int x, int y, int noOfMoves) {
            this.x = x;
            this.y = y;
            this.noOfMoves = noOfMoves;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int getNoOfMoves() {
            return noOfMoves;
        }

        public void setNoOfMoves(int noOfMoves) {
            this.noOfMoves = noOfMoves;
        }
    }
}
