package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LineToCashier {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(b.readLine()), min = Integer.MAX_VALUE;
        StringTokenizer token1 = new StringTokenizer(b.readLine()), token2;
        while (token1.hasMoreTokens()) {
            int queue = Integer.parseInt(token1.nextToken()), sum = 0;
            token2 = new StringTokenizer(b.readLine());
            while (token2.hasMoreTokens()) {
                sum += (Integer.parseInt(token2.nextToken()) * 5);
            }
            min = ((sum += queue * 15) < min) ? sum : min;
        }
        System.out.println(min);
    }
}