package Testing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class TheStonesGame {
    public static void main(String[] args) throws Exception {
        BufferedReader data = new BufferedReader(new InputStreamReader(System.in));

        int tc = parseInt(data.readLine());
        while (tc-- > 0) {
            StringTokenizer tokenizer = new StringTokenizer(data.readLine());
            int n = parseInt(tokenizer.nextToken()), m = parseInt(tokenizer.nextToken()), x = parseInt(tokenizer.nextToken());
            String result = "NO";
            if (n == x) {
                result = "YES";
            } else if (n - m > 0) {
                if (m == 1) {
                    result = "YES";
                } else {
                    n = n - (n - m);
                    if (x == n || x + 1 == n) {
                        result = "YES";
                    }
                }
            }
            System.out.println(result);
        }
    }
}
