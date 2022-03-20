package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RestoringPassword {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String code = b.readLine();
        String[] subCode = new String[10];
        String str1;
        for (int i = 0; i < subCode.length; i++) {
            subCode[i] = b.readLine();
        }
        for (int i = 0; i < code.length(); i += 10) {
            str1 = code.substring(i, 10 + i);
            for (int j = 0; j < subCode.length; j++) {
                if (str1.equals(subCode[j])) {
                    System.out.print(j);
                }
            }
        }
        System.out.println();
    }
}