package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class IncreaseAndDecrease {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int length = parseInt(reader.readLine()), sum = 0;
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        while (tokenizer.hasMoreTokens()) {
            sum += parseInt(tokenizer.nextToken());
        }

        System.out.println((sum % length == 0) ? length : length - 1);
    }
}
