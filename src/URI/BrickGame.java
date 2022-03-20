package URI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BrickGame {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter f = new BufferedWriter(new OutputStreamWriter(System.out));
        int test = Integer.parseInt(b.readLine());
        for (int i = 1; i <= test; i++) {
            StringTokenizer string = new StringTokenizer(b.readLine());
            int team = Integer.parseInt(string.nextToken()), age = (team / 2) + 1;
            while (team > age) {
                string.nextToken();
                team--;
            }
            f.write("Case " + i + ": " + string.nextToken());
            f.newLine();
        }
        f.flush();
    }
}