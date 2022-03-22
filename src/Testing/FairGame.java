package Testing;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FairGame {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] freq = new int[101];
        int tc = Integer.parseInt(reader.readLine());
        int max1 = 0, max2 = 0, index1 = -1, index2 = -1;
        for (int i = 0; i < tc; i++) {
            int num = Integer.parseInt(reader.readLine());

            freq[num]++;
            if (freq[num] >= max1) {
                max2 = max1;
                index2 = index1;
                max1 = freq[num];
                index1 = num;
            } else if (freq[num] >= max2) {
                max2 = freq[num];
                index2 = num;
            }
        }

        if (max1 + max2 == tc) {
            System.out.printf("YES\n%d %d", index1, index2);
        } else {
            System.out.println("NO");
        }
    }
}
