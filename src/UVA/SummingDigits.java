package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SummingDigits {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while (!(line = reader.readLine()).equals("0")) {
            int n = Integer.parseInt(line);
            System.out.println(sum(n));
        }
    }

    public static int sum(int x) {
        int sum = 0;
        for (int i = x; i != 0; i = i / 10) {
            sum = sum + i % 10;
        }

        if (sum < 10)
            return sum;
        else
            return sum(sum);
    }
}
