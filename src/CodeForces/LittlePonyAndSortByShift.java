package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LittlePonyAndSortByShift {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int x[] = new int[Integer.parseInt(b.readLine())], i = 0, needShift = 0, index = 0;
        StringTokenizer token = new StringTokenizer(b.readLine());
        while (token.hasMoreTokens()) {
            x[i] = Integer.parseInt(token.nextToken());
            if (i > 0) {
                if (x[i - 1] > x[i]) {
                    needShift++;
                    index = i;
                }
            }
            i++;
        }
        System.out.println((needShift == 0) ? 0 : (needShift > 1) ? -1 : (x[x.length - 1] <= x[0]) ? x.length - index : -1);
    }
}