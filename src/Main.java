import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static char[][] maze;
    private static int[] xM = {0, -1, 0, 1};
    private static int[] yM = {-1, 0, 1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = reader.readLine().split(" ");

        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);
        int k = Integer.parseInt(inputs[2]);

        maze = new char[n][m];
        for (int i = 0; i < n; i++) {
            maze[i] = reader.readLine().toCharArray();
        }

        Point p = null;

        Loop:
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (maze[i][j] == '.') {
                    p = new Point(i, j);
                    break Loop;
                }
            }
        }

        boolean[][] visited = new boolean[maze.length][maze[0].length];
        visited[p.x][p.y] = true;

        DFS(p, visited, new Wrapper(k));

        for (char[] line : maze) {
            System.out.println(line);
        }
    }

    public static void DFS(Point point, boolean[][] visited, Wrapper wrap) {
        if (wrap.k == 0) {
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nX = point.x + xM[i], nY = point.y + yM[i];

            if (inRange(nX, nY) && !visited[nX][nY] && maze[nX][nY] == '.') {
                visited[nX][nY] = true;
                DFS(new Point(nX, nY), visited, wrap);
            }
        }

        if (wrap.k > 0) {
            maze[point.x][point.y] = 'X';
            wrap.k--;
        }
    }

    private static boolean inRange(int x, int y) {
        return x >= 0 && x < maze.length && y >= 0 && y < maze[0].length;
    }

    private static class Point {

        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static class Wrapper {

        int k;

        Wrapper(int k) {
            this.k = k;
        }
    }
}
