package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class YoungPhysicist {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(reader.readLine());
        int xsum = 0, ysum = 0, zsum = 0;
        for (int i = 0; i < tc; i++) {
            StringTokenizer token = new StringTokenizer(reader.readLine());
            xsum += Integer.parseInt(token.nextToken());
            ysum += Integer.parseInt(token.nextToken());
            zsum += Integer.parseInt(token.nextToken());
        }

        String result = "NO";
        if (xsum == 0 && ysum == 0 && zsum == 0) {
            result = "YES";
        }
        System.out.println(result);
    }
}
