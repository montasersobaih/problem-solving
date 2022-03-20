package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SystemAdministrator {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = null;
        int[][] packet = new int[2][2];

        int tc = parseInt(reader.readLine());
        while (tc-- > 0) {
            tokenizer = new StringTokenizer(reader.readLine());
            int ping = parseInt(tokenizer.nextToken());
            int x = parseInt(tokenizer.nextToken());
            int y = parseInt(tokenizer.nextToken());

            packet[ping - 1][0] += x;
            packet[ping - 1][1] += (x + y);
        }
        System.out.println((packet[0][0] >= packet[0][1] / 2) ? "LIVE" : "DEAD");
        System.out.println((packet[1][0] >= packet[1][1] / 2) ? "LIVE" : "DEAD");
    }

    private static int parseInt(String convert) {
        return Integer.parseInt(convert);
    }
}
