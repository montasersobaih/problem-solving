package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MagicalBamboos {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(reader.readLine());
        while (loop-- > 0) {
            int length = Integer.parseInt(reader.readLine());
            int[] arr = new int[length];

            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            for (int j = 0; j < length; j++) {
                arr[j] = Integer.parseInt(tokenizer.nextToken());
            }

            boolean check = true;
            if (arr[0] % 2 == 0) {
                for (int j = 1; j < length; j++) {
                    if (arr[j] % 2 != 0) {
                        check = false;
                        break;
                    }
                }
            } else {
                for (int j = 1; j < length; j++) {
                    if (arr[j] % 2 == 0) {
                        check = false;
                        break;
                    }
                }
            }
            System.out.println((check) ? "yes" : "no");
        }
    }
}
