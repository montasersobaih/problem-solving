package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IWannaBeTheGuy {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(b.readLine()), loop = 2, count = 0, loop2, x[] = new int[length];
        while (loop-- > 0) {
            StringTokenizer token = new StringTokenizer(b.readLine());
            loop2 = Integer.parseInt(token.nextToken());
            while (loop2-- > 0) {
                int a = Integer.parseInt(token.nextToken());
                if (x[a - 1] != a) {
                    x[a - 1] = a;
                    count++;
                }
            }
        }
        System.out.println((count == length) ? "I become the guy." : "Oh, my keyboard!");
    }
}