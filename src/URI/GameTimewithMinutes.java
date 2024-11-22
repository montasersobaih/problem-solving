package URI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.StringTokenizer;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962-786258874
     * @link <a href="https://judge.beecrowd.com/en/problems/view/1047">Game Time with Minutes</a>
 * @algorithm
 * @since 09-11-2022
 */

class GameTimeWithMinutesSolution1 {

    public static void main(String[] args) throws Exception {
        int[] start = {0, 0}, end = {0, 0};

        try (Reader reader = new InputStreamReader(System.in)) {
            BufferedReader bReader = new BufferedReader(reader);
            StringTokenizer tokenizer = new StringTokenizer(bReader.readLine());

            start[0] = Integer.parseInt(tokenizer.nextToken());
            start[1] = Integer.parseInt(tokenizer.nextToken());
            end[0] = Integer.parseInt(tokenizer.nextToken());
            end[1] = Integer.parseInt(tokenizer.nextToken());
        }

        try (Writer writer = new OutputStreamWriter(System.out)) {
            PrintWriter pWriter = new PrintWriter(writer);

            int minute = 0;
            do {
                minute += 60;
                start[0] = (start[0] + 1) % 24;
            } while (start[0] != end[0]);

            minute = minute + (end[1] - start[1]);
            if (start[1] == end[1]) {
                pWriter.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", (minute / 60), (minute % 60));
            } else {
                pWriter.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", (minute / 60) % 24, (minute % 60));
            }
        }
    }
}

class GameTimeWithMinutesSolution2 {

    public static void main(String[] args) throws Exception {
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pWriter = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(bReader.readLine());

        int start = Integer.parseInt(tokenizer.nextToken()) * 60 + Integer.parseInt(tokenizer.nextToken());
        int end = Integer.parseInt(tokenizer.nextToken()) * 60 + Integer.parseInt(tokenizer.nextToken());
        int diff = end - start;

        if (diff <= 0) {
            diff += (24 * 60);
        }

        pWriter.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", diff / 60, diff % 60);
        pWriter.flush();
    }
}
