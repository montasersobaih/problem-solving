package URI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CollectableCards {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        int loop = Integer.parseInt(b.readLine());
        while (loop-- > 0) {
            StringTokenizer tokenizer = new StringTokenizer(b.readLine());
            //GCD Operation
            int first = Integer.parseInt(tokenizer.nextToken());
            int second = Integer.parseInt(tokenizer.nextToken());
            while (second != 0) {
                int temp = first;
                first = second;
                second = temp % first;
            }
            //=============
            System.out.println(first);
        }
    }
}