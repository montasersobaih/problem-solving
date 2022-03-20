package UVA;
//Prime Word

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrimeWordWithBSAlg {
    private static char[] x = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
            , 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = bf.readLine()) != null) {
            int sum = 0;
            for (int i = 0; i < str.length(); i++) {
                sum += BS(str.charAt(i));
            }
            System.out.println((isPrime(sum)) ? "It is a prime word." : "It is not a prime word.");
        }
    }

    public static int BS(char ch) {
        int first = (Character.isUpperCase(ch)) ? (x.length / 2) : 0,
                last = (Character.isUpperCase(ch)) ? x.length - 1 : (x.length - 1) / 2, mid = 0;
        while (first <= last) {
            mid = (first + last) / 2;
            if (ch == x[mid]) {
                return mid + 1;
            } else if (ch > x[mid]) {
                first = (mid + 1);
            } else {
                last = (mid - 1);
            }
        }
        return -1;
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