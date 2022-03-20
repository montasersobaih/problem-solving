package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Lecture {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String[] str1 = b.readLine().split(" ");
        String str2;
        int loop1 = Integer.parseInt(str1[0]), loop2 = Integer.parseInt(str1[1]);
        HashMap<String, String> hash = new HashMap<>();
        while (loop2-- > 0) {
            str1 = b.readLine().split(" ");
            hash.put(str1[0], (str1[1].length() < str1[0].length()) ? str1[1] : str1[0]);
        }
        str1 = b.readLine().split(" ");
        for (int i = 0; i < str1.length; i++) {
            System.out.print(hash.get(str1[i]) + ((i + 1 < str1.length) ? " " : ""));
        }
    }
}