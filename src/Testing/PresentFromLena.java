package Testing;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PresentFromLena {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int length = parseInt(reader.readLine());

        String space = "";
        int eq = ((length * 2 - 1) + 2) * 2;
        for (int i = 0; i < eq; i++) {
            space = space.concat(" ");
        }

        for (int i = length; i >= 0; i--) {
            StringBuilder builder = new StringBuilder(space);
            for (int j = length; j >= i; j--) {
//                builder.setCharAt(builder.length() - j, );
            }
        }
    }

    private static int parseInt(String convert) {
        return Integer.parseInt(convert);
    }
}
