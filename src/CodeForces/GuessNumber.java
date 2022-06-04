package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


public class GuessNumber {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

        int l = 1, r = (int) 10e9, mid = 0;
        while (l != r) {
            mid = (l + r + 1) / 2;
            writer.println(mid);

            char c = reader.readLine().charAt(0);
            if (c == '<') {
                r = mid - 1;
            } else if (c == '>') {
                l = mid + 1;
            } else {
                break;
            }
        }

        writer.printf("! %d\n", mid);
        writer.flush();
    }
}