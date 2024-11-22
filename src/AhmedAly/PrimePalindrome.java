package AhmedAly;
//Prime Palindrome

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.Long.parseLong;

public class PrimePalindrome {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String str1 = b.readLine();
        if (str1.equals(new StringBuilder(str1).reverse().toString())) {
            System.out.println((isPrime(parseLong(str1))) ? str1 : nextPalindrome(str1));
        } else {
            System.out.println(nextPalindrome(str1));
        }
    }

    private static long nextPalindrome(String str1) {
        long h = parseLong(str1);
        while (h++ <= Long.MAX_VALUE) {
            str1 = Long.toString(h);
            if (str1.equals(new StringBuilder(str1).reverse().toString())) {
                if (isPrime(h)) {
                    return h;
                }
            }
        }
        return 0;
    }

    private static boolean isPrime(long num) {
        if (num == 1) {
            return false;
        } else if (num == 2) {
            return true;
        } else if (num % 2 == 0) {
            return false;
        }

        for (long i = 3; (i * i) <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}