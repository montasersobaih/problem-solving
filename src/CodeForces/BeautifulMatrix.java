package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BeautifulMatrix {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        for (int i = 0; i < 5; i++) {
            StringTokenizer token = new StringTokenizer(reader.readLine());
            for (int j = 0; j < 5; j++) {
                int num = Integer.parseInt(token.nextToken());
                if (num == 1) {
                    int calc = Math.abs(i - 2) + Math.abs(j - 2);
                    System.out.println(calc);
                    System.exit(0);
                }
            }
        }
    }
}
