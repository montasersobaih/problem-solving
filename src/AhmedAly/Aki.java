package AhmedAly;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Aki {
    private static BufferedReader data;

    public static void main(String[] args) {
        data = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = readLine();

        String result = "Not Palindrome";
        if (builder.toString().equalsIgnoreCase(builder.reverse().toString())) {
            result = "Palindrome";
        }
        System.out.println(result);
    }

    private static StringBuilder readLine() {
        StringBuilder builder = new StringBuilder();
        try {
            int c = 0;
            while (data.ready() && (c = data.read()) != '\n') {
                builder.append((char) c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return builder;
    }
}
