package AhmedAly;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StringswithSameLetters {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        long count = 1;
        String str1 = b.readLine(), str2 = b.readLine();
        while (!(str1.equals("END") && str2.equals("END"))) {
            char[] A1 = str1.toCharArray(), A2 = str2.toCharArray();
            Arrays.sort(A1);
            Arrays.sort(A2);

            String str3 = new String(A1), str4 = new String(A2);
            if (str3.compareTo(str4) == 0) {
                System.out.println("Case " + count++ + ": same");
            } else {
                System.out.println("Case " + count++ + ": different");
            }
            str1 = b.readLine();
            str2 = b.readLine();
        }
    }
}