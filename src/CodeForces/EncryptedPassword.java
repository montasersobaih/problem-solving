package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962-786258874
 * @link <a href="https://codeforces.com/gym/100155/problem/C">C. Encrypted Password</a>
 * @algorithm Frequency array
 * @since 09-11-2022
 */

public class EncryptedPassword {

    private static final int[] originalFreq = new int[26];

    private static final int[] encryptedFreq = new int[26];

    public static void main(String[] args) throws Exception {
        Reader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        String ePassword = reader.readLine();
        String oPassword = reader.readLine();

        System.out.println(validate(oPassword, ePassword));
    }

    private static String validate(String oPassword, String ePassword) {
        int oLength = oPassword.length();
        for (int i = 0; i < oLength; i++) {
            originalFreq[oPassword.charAt(i) - 'a']++;
        }

        encryptedFreq[ePassword.charAt(0) - 'a']++;

        int l = 0, r = 0;
        int eLength = ePassword.length();
        while (l < eLength && r < eLength) {
            int result = 0;

            for (int i = 0; i < 26; i++) {
                if (originalFreq[i] != encryptedFreq[i]) {
                    result = Integer.compare(originalFreq[i], encryptedFreq[i]);
                    break;
                }
            }

            if (result == 0) {
                return "YES";
            } else if (result > 0 && ++r < eLength) {
                encryptedFreq[ePassword.charAt(r) - 'a']++;
            } else {
                encryptedFreq[ePassword.charAt(l++) - 'a']--;
            }
        }

        return "NO";
    }
}