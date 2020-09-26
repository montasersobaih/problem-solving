package Spoj;
//Next PalindRome

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PALINTheNextPalindrome {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(b.readLine());
        while (loop-- > 0) {
            String str = b.readLine();
            if (!isEqual999(str)) {
                System.out.println(nextBalindrome(str));
            }
        }
    }

    //---------------------Check If The Is Equal 999 Or 9999 ....---------------------
    static boolean isEqual999(String str) {
        int length = str.length();
        //-------------------------Check Is Equal 999---------------------------
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != '9') {
                return false;
            }
        }
        //---------------------------If is Equal 999----------------------------
        length++;//Add new digit
        String str1 = "";
        for (int i = 0; i < (length - 2); i++) {
            str1 += 0;
        }
        System.out.println("1" + str1 + "1");
        return true;
    }

    //--------------------------Find The Mext BalindRome------------------------
    static String nextBalindrome(String str) {
        char[] c = str.toCharArray();
        int i = 0, j = 0;
        //----------------------------Set Pointers------------------------------
        if (c.length % 2 == 0) {
            i = (c.length / 2) - 1;
            j = (c.length / 2);
        } else {
            i = j = (c.length / 2);
        }
        //---------------------------Check Numbers------------------------------
        while (c[i] == c[j]) {
            i--;
            j++;
            if (i < 0) {
                break;
            }
        }
        //-------------------------While Loop Stopped---------------------------
        if (i < 0) {
            edit_i_SmallerThan_j(c);
        } else {
            if (c[i] > c[j]) {
                edit_i_GreaterThan_j(i, j, c);
            } else {
                edit_i_SmallerThan_j(c);
            }
        }
        return new String(c);
    }

    //----------------------------Edit I Smaller Than J-------------------------
    static void edit_i_SmallerThan_j(char[] c) {
        int i = 0, j = 0, arraymid = (c.length / 2);
        //----------------------------Set Pointers------------------------------
        if (c.length % 2 == 0) {
            i = arraymid - 1;
            j = arraymid;
        } else {
            i = j = arraymid;
        }

        int increment = 0, cr = 1;
        //--------------------------Edit Balindrome-----------------------------
        while (i >= 0) {
            increment = c[i] - '0';
            increment += cr;

            if (increment > 9) {
                cr = 1;
                increment = 0;
            } else {
                cr = 0;
            }

            c[i] = (char) (increment + 48);
            c[j] = (char) (increment + 48);
            i--;
            j++;
        }
    }

    //----------------------------Edit I Greater Than J-------------------------
    static void edit_i_GreaterThan_j(int i, int j, char[] c) {
        while (i >= 0) {
            int k = c[i] - '0';
            c[j] = (char) (k + 48);
            i--;
            j++;
        }
    }
}