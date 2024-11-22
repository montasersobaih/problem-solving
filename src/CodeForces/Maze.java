package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Stack;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962-786258874
 * @link <a href="https://codeforces.com/contest/377/problem/A">A. Maze</a>
 * @algorithm DFS and similar
 * @since 09-11-2022
 */

class MazeSolution1 {

    private static final int[] xM = {-1, 0, 1, 0};

    private static final int[] yM = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(reader.readLine());

        int n = parseInt(token.nextToken());
        int m = parseInt(token.nextToken());
        int walls = parseInt(token.nextToken());

        char[][] grid = new char[n][m];
        for (int i = 0; i < n; i++) {
            grid[i] = reader.readLine().toCharArray();
        }

        Loop:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '.') {
                    dfs(grid, new Point(i, j), walls);
                    break Loop;
                }
            }
        }

        for (char[] seq : grid) {
            System.out.println(seq);
        }
    }

    private static void dfs(char[][] grid, Point start, int walls) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        visited[start.x][start.y] = true;
        deep(grid, start, visited, new int[]{walls});
    }

    private static Stack<Point> deep(char[][] grid, Point p, boolean[][] visited, int[] walls) {
        Stack<Point> stack = new Stack<>();

        for (int i = 0; i < 4; i++) {
            int nX = p.x + xM[i], nY = p.y + yM[i];

            if (inRange(nX, nY, grid) && !visited[nX][nY] && grid[nX][nY] == '.') {
                visited[nX][nY] = true;
                stack.addAll(deep(grid, new Point(nX, nY), visited, walls));
            }
        }

        if (walls[0] > 0) {
            grid[p.x][p.y] = 'X';
            walls[0]--;
        }

        return stack;
    }

    private static boolean inRange(int x, int y, char[][] grid) {
        return x >= 0 && x < grid.length && y >= 0 && y < grid[0].length;
    }

    private static class Point {

        int x;

        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

class MazeSolution2 {

    private static final int[] xM = {0, -1, 0, 1};

    private static final int[] yM = {-1, 0, 1, 0};

    private static char[][] maze;

    public static void main(String[] args) throws IOException {
        Reader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(tokenizer.nextToken());

        maze = new char[n][m];
        for (int i = 0; i < n; i++) {
            maze[i] = reader.readLine().toCharArray();
        }

        Point point = null;

        Loop:
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (maze[i][j] == '.') {
                    point = new Point(i, j);
                    break Loop;
                }
            }
        }

        boolean[][] visited = new boolean[n][m];
        visited[point.x][point.y] = true;
        DFS(point, visited, new int[]{k});

        for (char[] line : maze) {
            System.out.println(line);
        }
    }

    public static void DFS(Point point, boolean[][] visited, int[] walls) {
        if (walls[0] == 0) {
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nX = point.x + xM[i], nY = point.y + yM[i];

            if (inRange(nX, nY) && !visited[nX][nY] && maze[nX][nY] == '.') {
                visited[nX][nY] = true;
                DFS(new Point(nX, nY), visited, walls);
            }
        }

        if (walls[0]-- > 0) {
            maze[point.x][point.y] = 'X';
        }
    }

    private static boolean inRange(int x, int y) {
        return x >= 0 && x < maze.length && y >= 0 && y < maze[0].length;
    }

    private static class Point {

        private final int x, y;

        private Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}