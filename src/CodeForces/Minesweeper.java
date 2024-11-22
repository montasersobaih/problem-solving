package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Minesweeper {

    private static final int xAxis[] = {-1, -1, -1, 0, 0, 1, 1, 1};

    private static final int yAxis[] = {-1, 0, 1, -1, 1, -1, 0, 1};

    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int height = Integer.parseInt(tokenizer.nextToken());
        int width = Integer.parseInt(tokenizer.nextToken());

        char[][] twoD = new char[height][width];
        for (int i = 0; i < height; i++) {
            twoD[i] = reader.readLine().toCharArray();
        }


        String result = "YES";
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int bomb = 0;
                for (int k = 0; k < xAxis.length; k++) {
                    int x = i + xAxis[k];
                    int y = j + yAxis[k];

                    if (x >= 0 && y >= 0 && x < height && y < width) {
                        if (twoD[x][y] == '*') {
                            bomb++;
                        }
                    }
                }

                char c = twoD[i][j];
                if (c == '.' && bomb != 0) {
                    result = "NO";
                } else if (Character.isDigit(c) && bomb != (c - '0')) {
                    result = "NO";
                }
            }
        }

        System.out.println(result);
    }
}
