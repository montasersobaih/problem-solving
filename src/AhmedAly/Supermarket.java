package AhmedAly;

import java.io.InputStream;

public class Supermarket {
    public static void main(String[] args) {
//        BufferedInputStream stream = new BufferedInputStream(System.in);
//        BufferedReader stream = new BufferedReader(new InputStreamReader(System.in));
//        InputStreamReader stream = new InputStreamReader(System.in);
        InputStream stream = System.in;

        int items = Integer.parseInt(read(stream));
        long money = Long.parseLong(read(stream));
        for (int i = 0; i < items && money >= 0; i++) {
            money -= Long.parseLong(read(stream));
        }

        System.out.println((money >= 0) ? "Yes" : "No");
    }

    private static String read(InputStream reader) {
        StringBuilder builder = new StringBuilder();
        try {
            int c = 0;
            while ((c = reader.read()) != ' ' && c != '\n') {
                builder.append((char) c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return builder.toString();
    }
}