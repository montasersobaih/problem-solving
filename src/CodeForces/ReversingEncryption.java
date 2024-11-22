package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962786258874
 * @link https://codeforces.com/group/MUjDsRjHXt/contest/302066/problem/E
 * @since 01-06-2022
 */

public class ReversingEncryption {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(reader.readLine());
        char[] chars = new char[length];
        for (int i = 0; i < length; i++) {
            chars[i] = (char) reader.read();
        }

        for (int i = 0; i < length; i++) {
            if (length % (i + 1) == 0) {
                for (int j = 0; j <= i / 2; j++) {
                    char swap = chars[j];
                    chars[j] = chars[i - j];
                    chars[i - j] = swap;
                }
            }
        }

        System.out.println(chars);
    }
}
