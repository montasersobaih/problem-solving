package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class AutomateTheGrades {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(b.readLine()), x[] = new int[7];
        for (int i = 1; i <= loop; i++) {
            StringTokenizer token = new StringTokenizer(b.readLine());
            for (int j = 0; j < x.length; j++) {
                x[j] = parseInt(token.nextToken());
            }
            Arrays.sort(x, 4, x.length);
            int sum = x[0] + x[1] + x[2] + x[3] + (x[5] + x[6]) / 2;
            System.out.format("Case %d: %s\n", i, (sum >= 90) ? 'A' : (sum >= 80) ? 'B' : (sum >= 70) ? 'C' : (sum >= 60) ? 'D' : 'F');
        }
    }
}