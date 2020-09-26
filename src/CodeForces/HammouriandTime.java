package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HammouriandTime {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer string = new StringTokenizer(b.readLine().replace(":", " "));
        int minute1 = (Integer.parseInt(string.nextToken()) * 60) + Integer.parseInt(string.nextToken()),
                minute2 = (Integer.parseInt(string.nextToken()) * 60) + Integer.parseInt(string.nextToken());

        string = new StringTokenizer(b.readLine().replace(":", " "));
        int minute3 = (Integer.parseInt(string.nextToken()) * 60) + Integer.parseInt(string.nextToken()),
                minute4 = (Integer.parseInt(string.nextToken()) * 60) + Integer.parseInt(string.nextToken());

        if (minute1 >= minute3 && minute1 <= minute4 ||
                minute2 >= minute3 && minute2 <= minute4 ||
                minute3 >= minute1 && minute3 <= minute2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}