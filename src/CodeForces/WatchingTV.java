package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class WatchingTV {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int cases = parseInt(reader.readLine());
        while (cases-- > 0) {
            int freq[] = new int[100000];
            int numOfChanels = parseInt(reader.readLine());

            int frequency = 0, maxChanells = 0;
            for (int i = 0; i < numOfChanels; i++) {
                String split[] = reader.readLine().split(" ");

                int freq1 = parseInt(split[1]);
                if (++freq[freq1] > maxChanells) {
                    maxChanells = freq[freq1];
                    frequency = freq1;
                } else if (freq[freq1] == maxChanells) {
                    if (freq1 < frequency) {
                        frequency = freq1;
                    }
                }
            }
            System.out.println(frequency);
        }
    }
}
