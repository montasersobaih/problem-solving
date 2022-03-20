package AhmedAly;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class FlirtWithGirls {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(reader.readLine());
        while (tc-- > 0) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int girls = Integer.parseInt(tokenizer.nextToken());
            int radius = Integer.parseInt(tokenizer.nextToken());

            int count = 0;
            for (int i = 0; i < girls; i++) {
                tokenizer = new StringTokenizer(reader.readLine());
                int x = Integer.parseInt(tokenizer.nextToken());
                int y = Integer.parseInt(tokenizer.nextToken());

                double distance = Math.hypot(0 - x, 0 - y);
                if (distance <= radius) {
                    count++;
                }
            }
            writer.println(count);
        }
        writer.flush();
        writer.close();
    }
}
