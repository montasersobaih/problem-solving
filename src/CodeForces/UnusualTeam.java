package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UnusualTeam {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(b.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer token = new StringTokenizer(b.readLine());
            int n1 = Integer.parseInt(token.nextToken());
            int n2 = Integer.parseInt(token.nextToken());
            if (n1 < n2) {
                System.out.println("WeWillEatYou");
            } else {
                System.out.println("FunkyMonkeys");
            }
        }
    }
}
