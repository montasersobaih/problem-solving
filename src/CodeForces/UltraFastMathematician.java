package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @link https://codeforces.com/problemset/problem/61/A
 * @since 29-03-2022
 */

class UltraFastMathematicianSolution1 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str1 = reader.readLine();
        String str2 = reader.readLine();

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            builder.append(str1.charAt(i) == str2.charAt(i) ? 0 : 1);
        }

        System.out.println(builder);
    }
}

class UltraFastMathematicianSolution2 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str1 = reader.readLine();
        String str2 = reader.readLine();
        String result = new BigInteger(str1, 2).xor(new BigInteger(str2, 2)).toString(2);
        System.out.printf("%0" + str1.length() + "d", new BigInteger(result));
    }
}