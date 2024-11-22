package AhmedAly;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ConnectingRopes {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(b.readLine());
        while (loop-- > 0) {
            int rode = Integer.parseInt(b.readLine()), sum = 0, c = 0;
            StringTokenizer tokenizer = new StringTokenizer(b.readLine());
            while (tokenizer.hasMoreTokens()) {
                sum += Integer.parseInt(tokenizer.nextToken());
            }
            System.out.println(sum - ((rode * 2) - 2));
        }
    }
}