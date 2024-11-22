package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @since 20-03-2022
 */

public class HardWay {

    private static Comparator<Point> comparator = Comparator.comparingInt(o -> o.y);

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(reader.readLine());
        while (tc-- > 0) {
            Point[] points = new Point[3];
            for (int i = 0; i < 3; i++) {
                StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
                points[i] = new Point(Integer.parseInt(tokenizer.nextToken()), Integer.parseInt(tokenizer.nextToken()));
            }
            Arrays.sort(points, comparator);

            int distance = 0;
            if (points[1].y == points[2].y) {
                distance += Math.abs(points[1].x - points[2].x);
            }

            System.out.println(distance);
        }
    }

    private static class Point {

        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
