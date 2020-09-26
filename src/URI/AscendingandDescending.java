package URI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class AscendingandDescending {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter f = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer string = new StringTokenizer(b.readLine());
        int x = Integer.parseInt(string.nextToken());
        int y = Integer.parseInt(string.nextToken());

        while (x != y) {
            f.write(((x < y) ? "Crescente\n" : "Decrescente\n"));

            string = new StringTokenizer(b.readLine());
            x = Integer.parseInt(string.nextToken());
            y = Integer.parseInt(string.nextToken());
        }
        f.flush();
    }
}
