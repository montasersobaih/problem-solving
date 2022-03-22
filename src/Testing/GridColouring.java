package Testing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Queue;

public class GridColouring {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("Input.txt"));
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[][] grid = new char[32][];

        int height = 0;
        String str = null;
        while ((str = reader.readLine()) != null) {
            grid[height++] = str.toCharArray();
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                Point point = new Point(i, j);
                if (grid[i][j] == '#') {
                    bfs(point, grid, height, grid[i].length, '#');
                } else if (grid[i][j] == '/') {
                    bfs(point, grid, height, grid[i].length, '/');
                }
            }
        }

        for (int i = 0; i < height; i++) {
            System.out.println(grid[i]);
        }
    }

    private static void bfs(Point point, char[][] grid, int height, int width, char draw) {
        int[] xAxis = {0, -1, 0, 1};
        int[] yAxis = {-1, 0, 1, 0};

        Queue<Point> queue = new LinkedList<Point>();
        queue.offer(point);

        while (!queue.isEmpty()) {
            Point p = queue.poll();
            int x = p.getX(), y = p.getY();
            for (int i = 0; i < xAxis.length; i++) {
                int nx = x + xAxis[i], ny = y + yAxis[i];
                if (nx >= 0 && nx < height && ny >= 0 && ny < width) {
                    if (grid[nx][ny] == ' ') {
                        grid[nx][ny] = draw;
                        queue.offer(new Point(nx, ny));
                    }
                }
            }
        }
    }

    private static class Point {
        private int X, Y;

        public Point(int x, int y) {
            X = x;
            Y = y;
        }

        public int getX() {
            return X;
        }

        public void setX(int x) {
            X = x;
        }

        public int getY() {
            return Y;
        }

        public void setY(int y) {
            Y = y;
        }
    }
}
