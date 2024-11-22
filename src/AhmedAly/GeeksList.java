package AhmedAly;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GeeksList {
    private static BufferedReader data;

    public static void main(String[] args) throws Exception {
        data = new BufferedReader(new InputStreamReader(System.in));
        String name = readLine().concat(readLine()), search = readLine();

        String result = "I don't have time for parties, I have thigs to do.";
        if (search.contains(name)) {
            result = "Invited";
        }
        System.out.println(result);
    }

    private static String readLine() {
        StringBuilder builder = new StringBuilder();
        try {
            int c = 0;
            while ((c = data.read()) != -1 && c != '\n') {
                char l = (char) c;
                if (c != ' ') {
                    builder.append(l);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return builder.toString();
    }
}
