package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrimeWord {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while ((line = reader.readLine()) != null) {
            int sum = 0;
            for (int i = 0; i < line.length(); i++) {
                sum += find(line.charAt(i));
            }
            System.out.println((isPrime(sum)) ? "It is a prime word." : "It is not a prime word.");
        }
    }

    public static int find(char ch) {
        if (Character.isLowerCase(ch)) {
            return (ch - 'a') + 1;
        } else {
            return ((ch - 'A') + 26) + 1;
        }
    }

    public static boolean isPrime(int sum) {
        for (int i = 2; i < sum; i++) {
            if (sum % i == 0) {
                return false;
            }
        }

        return true;
    }
}