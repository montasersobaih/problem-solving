package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HazemandMountains {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String str1 = b.readLine();

        int height = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == '/') {
                height++;
            }
        }

        String[][] x = new String[height + 1][str1.length()];

        for (int i = (x.length - 1), j = 0; j < str1.length(); j++) {
            String c = Character.toString(str1.charAt(j));
            switch (c) {
                case "/":
                    x[i--][j] = c;
                    break;

                case "_":
                    x[i][j] = c;
                    break;

                default:
                    x[++i][j] = c;
                    break;
            }
        }

        for (String[] x1 : x) {
            String str2 = "";
            for (String x11 : x1) {
                str2 += x11;
            }

            if (str2.replace("null", "").length() != 0) {
                System.out.println(str2.replace("null", " "));
            }
        }
    }
}