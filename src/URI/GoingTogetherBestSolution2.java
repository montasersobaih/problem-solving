package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class GoingTogetherBestSolution2 {

    private static final int[] xM = {-1, 0, 1, 0};

    private static final int[] yM = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int cases = Integer.parseInt(reader.readLine());
        for (int loop = 1; loop <= cases; loop++) {
            int n = Integer.parseInt(reader.readLine());
            char[][] mat = new char[n][n];

            List<Location> start = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                mat[i] = reader.readLine().toCharArray();
                for (int j = 0; j < n; j++) {
                    if (Character.isLetter(mat[i][j]) && mat[i][j] != 'X') {
                        start.add(new Location(i, j));
                        mat[i][j] = '.';
                    }
                }
            }

            System.out.printf("Case %d: %s\n", loop, bfs(start, mat));
        }
    }

    private static Object bfs(List<Location> start, char[][] mat) {
        Set<Integer> visited = new HashSet<>();

        Queue<Move> queue = new LinkedList<>();
        queue.offer(new Move(start, 0));

        while (!queue.isEmpty()) {
            Move move = queue.poll();

            if (visited.add(move.uniqueIdx)) {
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

                    newLocations = removeDuplicate(newLocations, move.locations);

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
                if (i != j && location1.uniqueIndex == locations.get(j).uniqueIndex) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean isReached(List<Location> locations, char[][] mat) {
        for (Location location : locations) {
            if (mat[location.x][location.y] != 'X') {
                return false;
            }
        }

        return true;
    }

    private static List<Location> removeDuplicate(List<Location> newLocations, List<Location> oldLocations) {
        List<Location> finalLocations = new LinkedList<>();

        int length = newLocations.size();
        for (int i = 0; i < length; i++) {
            Location location1 = newLocations.get(i);

            boolean duplicate = false;
            for (int j = 0; j < length; j++) {
                if (i != j) {
                    if (location1.equals(newLocations.get(j))) {
                        duplicate = true;
                        break;
                    }
                }
            }

            if (duplicate) {
                location1 = oldLocations.get(i);
            }

            finalLocations.add(location1);
        }

        return finalLocations;
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
                this.uniqueIdx += location.uniqueIndex;
            }
        }
    }

    private static class Location {

        int x;

        int y;

        int uniqueIndex;

        public Location(int x, int y) {
            this.x = x;
            this.y = y;
            this.uniqueIndex = (x << 4) + y;
        }

        public boolean equals(Location location) {
            return this.x == location.x && this.y == location.y;
        }
    }
}