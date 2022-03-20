package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Laptops {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(b.readLine());
        String[] str1;
        String str2 = "Poor Alex";
        while (loop-- > 0) {
            str1 = b.readLine().split(" ");
            if (!str1[0].equals(str1[1])) {
                str2 = "Happy Alex";
                break;
            }
        }
        System.out.println(str2);
    }
}