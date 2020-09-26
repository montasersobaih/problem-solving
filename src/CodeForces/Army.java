package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Army {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(b.readLine()), sum = 0, start, end;
        args = b.readLine().split(" ");
        String[] x = b.readLine().split(" ");

        start = Integer.parseInt(x[0]) - 1;
        end = Integer.parseInt(x[1]) - 1;
        while (start < end) {
            sum += Integer.parseInt(args[start++]);
        }
        System.out.println(sum);
    }
}