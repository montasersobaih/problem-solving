package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AbdelkaderandCplusplus {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String str = b.readLine().replace(";", " ");
        StringTokenizer token = new StringTokenizer(str);

        long c = 0;
        while (token.hasMoreTokens()) {
            String str1 = token.nextToken();
            if (str1.contains("++")) {
                c++;
            } else if (str1.contains("--")) {
                c--;
            } else if (str1.contains("=")) {
                c = Long.parseLong(str1.substring(str1.indexOf("=") + 1));
            }
        }
        System.out.println(c);
    }
}