package URI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TheGreatestAnotherSolution {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer string = new StringTokenizer(b.readLine());

        int A = Integer.parseInt(string.nextToken()),
                B = Integer.parseInt(string.nextToken()),
                C = Integer.parseInt(string.nextToken());

        String str = null;
        if (A > B && A > C) {
            str = String.format("%d eh o maior", A);
        } else if (B > A && B > C) {
            str = String.format("%d eh o maior", B);
        } else {
            str = String.format("%d eh o maior", C);
        }
    }
}
