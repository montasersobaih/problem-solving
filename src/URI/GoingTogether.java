package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GoingTogether {

    private static final int[] xM = {-1, 0, 1, 0};

    private static final int[] yM = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int cases = Integer.parseInt(reader.readLine());
        for (int loop = 1; loop <= cases; loop++) {
            int n = Integer.parseInt(reader.readLine());
            int[][] mat = new int[n][n];

            List<Location> start = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    mat[i][j] = reader.read();
                    if (Character.isLetter(mat[i][j]) && mat[i][j] != 'X') {
                        start.add(new Location(i, j));
                        mat[i][j] = '.';
                    }
                }

                reader.skip(2);
            }

            Object result = bfs(start, mat);
            System.out.printf("Case %d: %s\n", loop, result);
        }
    }

    private static Object bfs(List<Location> start, int[][] mat) {
        boolean[] visited = new boolean[100000000];

        Queue<Move> queue = new LinkedList<>();
        queue.offer(new Move(start, 0));

        while (!queue.isEmpty()) {
            Move move = queue.poll();

            if (!visited[move.uniqueIdx]) {
                visited[move.uniqueIdx] = true;

                for (int i = 0; i < 4; i++) {
                    List<Location> newLocations = new LinkedList<>();

                    for (Location location : move.locations) {
                        int nX = location.x + xM[i], nY = location.y + yM[i];

                        if (isValidIndex(nX, nY, mat.length) && mat[nX][nY] != '#') {
                            newLocations.add(new Location(nX, nY));
                        } else {
                            newLocations.add(location);
                        }
                    }

                    removeDuplicate(newLocations, move.locations);

                    if (isUniqueLocations(newLocations)) {
                        if (isReached(newLocations, mat)) {
                            return move.commands + 1;
                        }

                        queue.offer(new Move(newLocations, move.commands + 1));
                    }
                }
            }
        }

        return "trapped";
    }

    private static boolean isValidIndex(int x, int y, int n) {
        return x >= 0 && x < n && y >= 0 && y < n;
    }

    private static boolean isUniqueLocations(List<Location> locations) {
        int length = locations.size();

        for (int i = 0; i < length; i++) {
            Location location1 = locations.get(i);
            for (int j = 0; j < length; j++) {
                if (i != j && location1.uniquePoint == locations.get(j).uniquePoint) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean isReached(List<Location> locations, int[][] mat) {
        for (Location location : locations) {
            if (mat[location.x][location.y] != 'X') {
                return false;
            }
        }

        return true;
    }

    private static void removeDuplicate(List<Location> newLocations, List<Location> oldLocations) {
        List<Location> finalLocations = new LinkedList<>();

        int length = newLocations.size();
        for (int i = 0; i < length; i++) {
            boolean duplicate = false;

            Location location1 = newLocations.get(i);
            for (int j = 0; j < length; j++) {
                if (i != j) {
                    Location location2 = newLocations.get(j);
                    if (location1.x == location2.x && location1.y == location2.y) {
                        duplicate = true;
                        break;
                    }
                }
            }

            finalLocations.add(duplicate ? oldLocations.get(i) : location1);
        }

        newLocations.clear();
        newLocations.addAll(finalLocations);
    }

    private static class Move {

        List<Location> locations;

        int commands;

        int uniqueIdx;

        Move(List<Location> locations, int commands) {
            this.locations = locations;
            this.commands = commands;

            for (Location location : locations) {
                this.uniqueIdx <<= 8;
                this.uniqueIdx += location.uniquePoint;
            }
        }
    }

    private static class Location {

        int x;

        int y;

        int uniquePoint;

        Location(int x, int y) {
            this.x = x;
            this.y = y;
            this.uniquePoint = (x << 4) + y;
        }
    }
}