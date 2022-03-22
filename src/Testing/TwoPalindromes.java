package Testing;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TwoPalindromes {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader reader = new BufferedReader(new FileReader("Input.txt"));

        StringBuilder builder = new StringBuilder();
        int tc = Integer.parseInt(reader.readLine());
        while (tc-- > 0) {
            int[] freq = new int[26];
            String line = reader.readLine();

            int length = line.length();
            for (int i = 0; i < length; i++) {
                freq[line.charAt(i) - 'a']++;
            }

            int tec = 0, ne = 0;
            for (int i = 0; i < 26; i++) {
                if (freq[i] % 2 != 0) {
                    ne++;
                }

                if (freq[i] > 1) {
                    tec++;
                }
            }

            builder.append((tec >= 2 && ne <= 1) ? "YES" : "NO").append("\n");
        }
        System.out.println(builder);
    }
}
