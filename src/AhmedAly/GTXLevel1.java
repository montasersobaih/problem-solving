package AhmedAly;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class GTXLevel1 {
    public static void main(String[] args) {
        BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
        int min1 = (int) 3e9, min2 = (int) 3e9;

        int tc = parseInt(read(data));
        while (tc-- > 0) {
            int num = parseInt(read(data));

            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        System.out.println(min1 + " " + min2);
    }

    private static String read(BufferedReader data) {
        StringBuilder builder = new StringBuilder();
        try {
            int i = 0;
            while ((i = data.read()) != ' ' && i != '\n') {
                builder.append((char) i);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return builder.toString();
    }
}
