package Testing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class Tabs {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader reader = new BufferedReader(new FileReader("Input.txt"));
        StringTokenizer tokenizer = null;

        int tc = parseInt(reader.readLine());
        while (tc-- > 0) {
            tokenizer = new StringTokenizer(reader.readLine());
            int N = parseInt(tokenizer.nextToken());
            int S = parseInt(tokenizer.nextToken());
            int T = parseInt(tokenizer.nextToken());

            long moves = 0;
            if (S < T) {
                moves = ((T - S) / 3) + ((T - S) % 3);
            } else {
                moves = ((N - S + T) / 3) + ((N - S + T) % 3);
            }

            System.out.println(moves);
        }
    }
}
