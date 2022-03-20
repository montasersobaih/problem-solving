package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BeautifulPaintings {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int numOfEle = Integer.parseInt(b.readLine());
        int[] x = new int[1001];
        int f$ = 0;
        String[] str = b.readLine().split(" ");
        for (int i = 0; i < str.length; i++) {
            x[Integer.parseInt(str[i])]++;
        }

        for (int i = 0; i < x.length; i++) {
            f$ = Math.max(f$, x[i]);
        }
        System.out.println(numOfEle - f$);
    }
}