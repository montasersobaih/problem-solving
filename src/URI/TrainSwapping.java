package URI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TrainSwapping {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        int loop = Integer.parseInt(b.readLine());
        while (loop-- > 0) {
            int length = Integer.parseInt(b.readLine());
            int[] sort = new int[length];
            StringTokenizer tokenizer = new StringTokenizer(b.readLine());

            for (int i = 0; i < length; i++) {
                sort[i] = Integer.parseInt(tokenizer.nextToken());
            }

            int count = 0;
            for (int i = length - 1; i >= 0; i--) {
                for (int j = 1; j <= i; j++) {
                    if (sort[j - 1] > sort[j]) {
                        int temp = sort[j - 1];
                        sort[j - 1] = sort[j];
                        sort[j] = temp;

                        count++;
                    }
                }
            }
            System.out.printf("Optimal train swapping takes %d swaps.\n", count);
        }
    }
}