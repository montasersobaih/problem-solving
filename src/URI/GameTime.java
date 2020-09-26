package URI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class GameTime {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer string = new StringTokenizer(b.readLine());
        int start = Integer.parseInt(string.nextToken()),
                end = Integer.parseInt(string.nextToken());

        int hour = 0;
        do {
            hour++;
            start = (start + 1) % 24;
        } while (start != end);

        BufferedWriter f = new BufferedWriter(new OutputStreamWriter(System.out));

        f.write(String.format("O JOGO DUROU %d HORA(S)\n", hour));
        f.flush();
        f.close();
        b.close();
    }
}
