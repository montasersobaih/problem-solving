package URI;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OneTwoThree {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String[] str1 = {"one 1", "two 2", "three 3"};

        int loop = Integer.parseInt(b.readLine());
        while (loop > 0) {

            String str2 = b.readLine();
            System.out.println(result(str1, str2));
            loop--;
        }
        b.close();
        System.exit(0);
    }

    public static char result(String[] str1, String str2) {
        for (int i = 0; i < str1.length; i++) {
            int count = 0;
            for (int j = 0; j < str1.length; j++) {

                if (str2.contains(Character.toString(str1[i].charAt(j)))) {
                    count++;

                    if (count > 1) {
                        return str1[i].charAt(str1[i].length() - 1);
                    }
                }
            }
        }
        return '0';
    }
}