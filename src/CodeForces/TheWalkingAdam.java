package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TheWalkingAdam {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(reader.readLine());
        while (tc-- > 0) {
            String line = reader.readLine();

            int count = 0;
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) != 'D') {
                    count++;
                } else {
                    break;
                }
            }

            System.out.println(count);
        }
    }

}