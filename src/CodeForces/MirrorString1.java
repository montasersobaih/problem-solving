package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MirrorString1 {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        int loop = Integer.parseInt(b.readLine());
        while (loop-- > 0) {
            String str = b.readLine(), regex = "[AHIMOTUVWXY]";
            StringBuilder builder = new StringBuilder(str);

            boolean is = false;
            if (str.replaceAll(regex, "").length() == 0) {
                if (str.equals(builder.reverse().toString())) {
                    is = true;
                }
            }
            System.out.println((is) ? "yes" : "no");
        }
    }
}
