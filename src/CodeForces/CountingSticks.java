package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountingSticks {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String str1 = b.readLine(), str2 = str1.replace("+", "");
        if (str2.substring(0, str2.indexOf('=')).compareTo(str2.substring(str2.indexOf('=') + 1)) == 0) {
            System.out.println(str1);
        } else if (str2.substring(0, str2.indexOf('=')).compareTo(str2.substring(str2.indexOf('=') + 1)) == -2) {
            System.out.println('|' + str1.substring(0, str1.length() - 1));
        } else if (str2.substring(0, str2.indexOf('=')).compareTo(str2.substring(str2.indexOf('=') + 1)) == 2) {
            if (str1.substring(0, str1.indexOf('+')).compareTo(str1.substring(str1.indexOf('+') + 1, str1.indexOf('='))) < 0) {
                System.out.println(str1.substring(0, str1.indexOf('+')) +
                        str1.substring(str1.indexOf('+'), str1.indexOf('=') - 1) +
                        str1.substring(str1.indexOf('=')) + '|');
            } else {
                System.out.println(str1.substring(1, str1.indexOf('+')) +
                        str1.substring(str1.indexOf('+'), str1.indexOf('=')) +
                        str1.substring(str1.indexOf('=')) + '|');
            }
        } else {
            System.out.println("Impossible");
        }
    }
}