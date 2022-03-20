package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class UnluckyTicket {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int mid = Integer.parseInt(b.readLine());
        String str1 = b.readLine();
        char[] c1 = str1.substring(0, mid).toCharArray(), c2 = str1.substring(mid).toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        System.out.println((check(c1, c2) || check(c2, c1)) ? "YES" : "NO");
    }

    private static boolean check(char[]... c) {
        for (int i = 0; i < c[0].length; i++) {
            if (c[0][i] >= c[1][i]) {
                return false;
            }
        }
        return true;
    }
}