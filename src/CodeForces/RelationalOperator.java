package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RelationalOperator {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        int loop = Integer.parseInt(b.readLine());
        while (loop-- > 0) {
            String[] x = b.readLine().split(" ");
            if (x[1].equals("<")) {
                System.out.println(Integer.parseInt(x[0]) < Integer.parseInt(x[2]));
            } else if (x[1].equals("<=")) {
                System.out.println(Integer.parseInt(x[0]) <= Integer.parseInt(x[2]));
            } else if (x[1].equals(">")) {
                System.out.println(Integer.parseInt(x[0]) > Integer.parseInt(x[2]));
            } else if (x[1].equals(">=")) {
                System.out.println(Integer.parseInt(x[0]) >= Integer.parseInt(x[2]));
            } else if (x[1].equals("==")) {
                System.out.println(Integer.parseInt(x[0]) == Integer.parseInt(x[2]));
            } else {
                System.out.println(Integer.parseInt(x[0]) != Integer.parseInt(x[2]));
            }
        }
    }
}