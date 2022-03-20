package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ILoveUsername {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int contests = parseInt(reader.readLine());
        int[] points = new int[contests];

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < contests; i++) {
            points[i] = parseInt(tokenizer.nextToken());
        }

        int min = points[0], max = points[0], count = 0;
        for (int i = 1; i < contests; i++) {
            if (points[i] > max) {
                max = points[i];
                count++;
            } else if (points[i] < min) {
                min = points[i];
                count++;
            }
        }
        System.out.println(count);
    }

    private static int parseInt(String convert) {
        return Integer.parseInt(convert);
    }
}
