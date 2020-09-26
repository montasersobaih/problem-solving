package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class Presents {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int length = parseInt(reader.readLine());
        int friends[] = new int[length];

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < length; i++) {
            friends[parseInt(tokenizer.nextToken()) - 1] = i + 1;
        }

        for (int i = 0; i < length; i++) {
            System.out.print(friends[i] + " ");
        }
        System.out.println();
    }
}
