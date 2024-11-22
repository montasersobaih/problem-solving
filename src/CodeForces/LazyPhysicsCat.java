package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LazyPhysicsCat {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        int loop = Integer.parseInt(b.readLine());
        while (loop-- > 0) {
            StringTokenizer tokenizer = new StringTokenizer(b.readLine());
            int radius = Integer.parseInt(tokenizer.nextToken()), angle = Integer.parseInt(tokenizer.nextToken());

            double rad = angle * Math.PI / 180;
            System.out.printf("%.6f\n", 0.5 * Math.pow(radius, 2) * (rad - Math.sin(rad)));
        }
    }
}

/*
3
1 90
2 180
10 30
*/