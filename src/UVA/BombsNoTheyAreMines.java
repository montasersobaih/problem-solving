package UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class BombsNoTheyAreMines {

    private static final int[] movRow = {-1, 1, 0, 0};

    private static final int[] movCol = {0, 0, -1, 1};

    private static boolean[][] grid;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer;

        String line;
        while ((line = reader.readLine()) != null) {
            if (line.equals("0 0")) {
                break;
            }

            tokenizer = new StringTokenizer(line);
            int rowNum = parseInt(tokenizer.nextToken()), colNum = parseInt(tokenizer.nextToken());

            grid = new boolean[rowNum][colNum];

            int bombs = parseInt(reader.readLine());
            for (int i = 0; i < bombs; i++) {
                tokenizer = new StringTokenizer(reader.readLine());
                int row = parseInt(tokenizer.nextToken()), numberOfBombs = parseInt(tokenizer.nextToken());

                for (int j = 0; j < numberOfBombs; j++) {
                    int bombLoc = parseInt(tokenizer.nextToken());
                    grid[row][bombLoc] = true;
                }
            }

            int time = bfs(new StringTokenizer(reader.readLine()), new StringTokenizer(reader.readLine()));
            System.out.println(time);
        }
    }

    private static int bfs(StringTokenizer begin, StringTokenizer end) {
        int startX = parseInt(begin.nextToken()), startY = parseInt(begin.nextToken());
        int endX = parseInt(end.nextToken()), endY = parseInt(end.nextToken());

        Queue<move> q = new ArrayDeque<>();
        q.offer(new move(startX, startY, 0));
        while (!q.isEmpty()) {
            move m = q.poll();

            if (m.x == endX && m.y == endY) {
                return m.steps;
            }

            for (int i = 0; i < 4; i++) {
                int newX = m.x + movRow[i], newY = m.y + movCol[i];

                if (!(newX >= 0 && newX < grid.length && newY >= 0 && newY < grid[0].length)) {
                    continue;
                }

                if (!grid[newX][newY]) {
                    q.add(new move(newX, newY, m.steps + 1));
                    grid[newX][newY] = true;
                }
            }
        }

        return -1;
    }

    private static class move {

        int x, y, steps;

        move(int x, int y, int steps) {
            this.x = x;
            this.y = y;
            this.steps = steps;
        }
    }
}