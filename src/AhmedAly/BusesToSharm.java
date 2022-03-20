package AhmedAly;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BusesToSharm {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        String text = "ACM-ACPC-2013";
        int loop = Integer.parseInt(b.readLine());
        for (int i = 1; i <= loop; i++) {
            StringTokenizer tokenizer = new StringTokenizer(b.readLine());
            int sum = Integer.parseInt(tokenizer.nextToken()) + Integer.parseInt(tokenizer.nextToken());
            System.out.printf("Case %d: %s\n", i, text.charAt(sum % text.length()));
        }
    }
}