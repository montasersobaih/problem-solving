package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CoachHazem {
    public static void main(String[] args) throws Exception {
//        BufferedReader b = new BufferedReader(new FileReader("Input"));
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer token = new StringTokenizer(b.readLine());
        long prob = Integer.parseInt(token.nextToken()), con = Integer.parseInt(token.nextToken());

        if (prob < con) {
            System.out.println(con - prob);
        } else {
            long h = (prob % con);
            if (h == 0) {
                System.out.println(h);
            } else {
                System.out.println(Math.max(h, con) - Math.min(h, con));
            }
        }
    }
}