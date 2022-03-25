package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class AutomateTheGrades {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(reader.readLine());
        for (int i = 1; i <= tc; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

            int[] n = new int[7];
            for (int j = 0; j < n.length; j++) {
                n[j] = Integer.parseInt(tokenizer.nextToken());
            }

            Arrays.sort(n, 4, n.length);
            n[4] = (n[5] + n[6]) / 2;

            int sum = 0;
            for (int j = 0; j < n.length - 2; j++) {
                sum += n[j];
            }

            char symbol;
            if (sum >= 90)
                symbol = 'A';
            else if (sum >= 80)
                symbol = 'B';
            else if (sum >= 70)
                symbol = 'C';
            else if (sum >= 60)
                symbol = 'D';
            else
                symbol = 'F';

            System.out.printf("Case %d: %c\n", i, symbol);
        }
    }
}