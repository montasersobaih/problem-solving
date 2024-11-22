package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.StringTokenizer;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962-786258874
 * @link <a href="https://codeforces.com/gym/100155/problem/I">I. Contest Hall Preparation</a>
 * @algorithm
 * @since 09-11-2022
 */

public class ContestHallPreparation {

    private static final int[] xAxis = {-1, 0, 1, -1, 1, -1, 0, 1};

    private static final int[] yAxis = {-1, -1, -1, 0, 0, 1, 1, 1};

    public static void main(String[] args) throws Exception {
        Reader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        StringTokenizer tokenizer;

        tokenizer = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());

        int[][] hall = new int[n][m];
        for (int i = 0; i < n; i++) {
            tokenizer = new StringTokenizer(reader.readLine());
            for (int j = 0; j < m; j++) {
                hall[i][j] = Integer.parseInt(tokenizer.nextToken());
            }
        }

        System.out.println(solve(n, m, hall));
    }

    private static int solve(int n, int m, int[][] hall) {
        boolean[] checked = new boolean[101];

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (hall[i][j] != -1 && !checked[hall[i][j] - 1]) {
                    for (int k = 0; k < 8; k++) {
                        int tableX = i + xAxis[k], tableY = j + yAxis[k];
                        if (tableX >= 0 && tableX < n && tableY >= 0 && tableY < m) {
                            if (hall[i][j] == hall[tableX][tableY]) {
                                checked[hall[i][j] - 1] = true;
                                count++;
                                break;
                            }
                        }
                    }
                }
            }
        }

        return count;
    }
}
