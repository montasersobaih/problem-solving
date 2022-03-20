package AhmedAly;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class ContestHallPreparation {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = null;

        int tc = parseInt(reader.readLine());
        while (tc-- > 0) {
            tokenizer = new StringTokenizer(reader.readLine());
            int n = parseInt(tokenizer.nextToken()), m = parseInt(tokenizer.nextToken());

            int[] xAxis = {-1, -1, -1, 0, 0, 1, 1, 1};
            int[] yAxis = {-1, 0, 1, -1, 1, -1, 0, 1};

            int count = 0;
            int[][] grid = new int[n][m];
            boolean[] uni = new boolean[101];
            for (int i = 0; i < n; i++) {
                tokenizer = new StringTokenizer(reader.readLine());
                for (int j = 0; j < m; j++) {
                    int check = grid[i][j] = parseInt(tokenizer.nextToken());
                    if (check != -1 && !uni[check]) {
                        for (int k = 0; k < 8; k++) {
                            int nx = i + xAxis[k], ny = j + yAxis[k];
                            if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                                if (check == grid[nx][ny]) {
                                    count++;
                                    uni[check] = true;
                                    break;
                                }
                            }
                        }
                    }
                }
            }

            System.out.println(count);
        }
    }
}
