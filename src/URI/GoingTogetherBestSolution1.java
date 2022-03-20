package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class GoingTogetherBestSolution1 {

    private static int[] xV = {-1, 0, 1, 0};

    private static int[] yV = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(reader.readLine());

        char[][][] mat = new char[cases][][];
        for (int i = 0; i < cases; i++) {
            int n = Integer.parseInt(reader.readLine());

            mat[i] = new char[n][n];
            for (int j = 0; j < n; j++) {
                mat[i][j] = reader.readLine().toCharArray();
            }
        }

        Location[] move = new Location[3];
        for (int i = 0; i < cases; i++) {
            char[][] grid = mat[i];

            int count = 0;
            for (int j = 0; j < grid.length; j++) {
                for (int k = 0; k < grid.length; k++) {
                    switch (grid[j][k]) {
                        case 'A':
                        case 'B':
                        case 'C':
                            move[count++] = new Location(j, k);
                            grid[j][k] = '.';
                            break;
                    }
                }
            }

            System.out.println("Case " + (i + 1) + ": " + bfs(grid, move));
        }
    }

    public static Object bfs(char[][] grid, Location[] locations) {
        boolean[] visited = new boolean[1666666];

        Queue<Move> queue = new ArrayDeque<>();
        queue.offer(new Move(locations, 0));

        while (!queue.isEmpty()) {
            Move move = queue.poll();

            if (!visited[move.index]) {
                visited[move.index] = true;

                for (int i = 0; i < 4; i++) {
                    Location[] newLocations = new Location[3];
                    for (int j = 0; j < 3; j++) {
                        int nX = move.location[j].x + xV[i];
                        int nY = move.location[j].y + yV[i];

                        if (nX >= 0 && nX < grid.length && nY >= 0 && nY < grid.length && grid[nX][nY] != '#') {
                            newLocations[j] = new Location(nX, nY);
                        } else {
                            newLocations[j] = move.location[j];
                        }
                    }

                    fixDuplicateLocation(newLocations, move.location);

                    if (isUniqueLocations(newLocations)) {
                        if (isArrived(grid, newLocations)) {
                            return move.cost + 1;
                        }

                        queue.offer(new Move(newLocations, move.cost + 1));
                    }
                }
            }
        }

        return "trapped";
    }

    private static void fixDuplicateLocation(Location[] newLocations, Location[] oldLocations) {
        for (int j = 0; j < 3; j++) {
            Location location1 = newLocations[j];
            for (int k = 0; k < 3; k++) {
                Location location2 = newLocations[k];
                if (j != k) {
                    if (location1.uniqueLocation == location2.uniqueLocation) {
                        newLocations[j] = oldLocations[j];
                    }
                }
            }
        }
    }

    private static boolean isUniqueLocations(Location[] locations) {
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                if (j != k) {
                    if (locations[j].uniqueLocation == locations[k].uniqueLocation) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    private static boolean isArrived(char[][] grid, Location[] locations) {
        for (int i = 0; i < 3; i++) {
            if (grid[locations[i].x][locations[i].y] != 'X') {
                return false;
            }
        }

        return true;
    }

    private static int getUniqueIndexForAll(Location[] locations) {
        int uniqueLocationForAll = 0;
        for (int i = 0; i < 3; i++) {
            int unique = locations[i].uniqueLocation;
            uniqueLocationForAll = uniqueLocationForAll << 7;
            uniqueLocationForAll += unique;
        }

        return uniqueLocationForAll;
    }

    private static class Move {

        Location[] location;

        int cost;

        int index;

        Move(Location[] location, int cost) {
            this.location = location;
            this.cost = cost;
            this.index = getUniqueIndexForAll(location);
        }
    }

    private static class Location {

        int x, y, uniqueLocation;

        Location(int x, int y) {
            this.x = x;
            this.y = y;
            this.uniqueLocation = (x * 10) + y;
        }
    }
}