package URI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ZeromeansZero {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer string = new StringTokenizer(b.readLine());
        int x = Integer.parseInt(string.nextToken());
        int y = Integer.parseInt(string.nextToken());
        while (x != 0 && y != 0) {
            System.out.println(Integer.toString(x + y).replace("0", ""));
            string = new StringTokenizer(b.readLine());
            x = Integer.parseInt(string.nextToken());
            y = Integer.parseInt(string.nextToken());
        }
    }
}