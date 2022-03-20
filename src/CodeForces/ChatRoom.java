package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ChatRoom {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String str1 = "hello", str2 = b.readLine(), str3 = "";
        for (int i = 0, j = 0; i < str2.length() && j < str1.length(); i++) {
            if (str1.charAt(j) == str2.charAt(i)) {
                str3 += str2.charAt(i);
                j++;
            }
        }
        System.out.println((str3.contains("hello")) ? "YES" : "NO");
    }
}