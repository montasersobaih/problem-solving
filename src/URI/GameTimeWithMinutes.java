package URI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class GameTimewithMinutes {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter f = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer string = new StringTokenizer(b.readLine());
        int[] x = {Integer.parseInt(string.nextToken()),
                Integer.parseInt(string.nextToken()),
                Integer.parseInt(string.nextToken()),
                Integer.parseInt(string.nextToken())};

        int minute = 0;
        do {
            minute += 60;
            x[0] = (x[0] + 1) % 24;
        } while (x[0] != x[2]);

        minute = minute + (x[3] - x[1]);
        f.write(String.format("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", (minute / 60), (minute % 60)));

        f.flush();
        f.close();
        b.close();
    }
}
