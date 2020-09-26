package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @Project ACM
 * @Author Montaser Sobaih
 * @Date 18-07-2020
 */

public class Maze {

    private static final int[] xM = {-1, 0, 1, 0};

    private static final int[] yM = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(reader.readLine());

        int n = parseInt(token.nextToken()), m = parseInt(token.nextToken()), walls = parseInt(token.nextToken());
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