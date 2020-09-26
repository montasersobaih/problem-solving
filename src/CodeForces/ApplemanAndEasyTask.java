package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ApplemanAndEasyTask {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(b.readLine());
        char[][] c1 = new char[loop][loop];
        for (int i = 0; i < c1.length; i++) {
            c1[i] = b.readLine().toCharArray();
        }
        for (int i = 0; i < c1.length; i++) {
            for (int j = 0; j < c1[i].length; j++) {
                int count = 0;
                count = (i - 1 >= 0) ? (c1[i - 1][j] == 'o') ? ++count : count : count;
                count = (j - 1 >= 0) ? (c1[i][j - 1] == 'o') ? ++count : count : count;
                count = (j + 1 < c1[i].length) ? (c1[i][j + 1] == 'o') ? ++count : count : count;
                count = (i + 1 < c1.length) ? (c1[i + 1][j] == 'o') ? ++count : count : count;
                if (count % 2 != 0) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }
}