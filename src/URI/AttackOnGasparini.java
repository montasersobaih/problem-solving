package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962-786258874
 * @link <a href="https://judge.beecrowd.com/en/problems/view/3343">Attack On Gasparini</a>
 * @algorithm
 * @since 09-11-2022
 */

public class AttackOnGasparini {

    public static void main(String[] args) throws IOException {
        int titansNum, wallHeight, titansSizes[] = new int[3];
        char[] titans;

        try (Reader reader = new InputStreamReader(System.in)) {
            BufferedReader bReader = new BufferedReader(reader);
            StringTokenizer tokenizer = new StringTokenizer(bReader.readLine());

            titansNum = Integer.parseInt(tokenizer.nextToken());
            wallHeight = Integer.parseInt(tokenizer.nextToken());

            titans = new char[titansNum];
            for (int i = 0; i < titansNum; i++) {
                titans[i] = (char) bReader.read();
            }
            bReader.readLine();

            tokenizer = new StringTokenizer(bReader.readLine());
            titansSizes[0] = Integer.parseInt(tokenizer.nextToken());
            titansSizes[1] = Integer.parseInt(tokenizer.nextToken());
            titansSizes[2] = Integer.parseInt(tokenizer.nextToken());
        }

        List<Integer> wallRemain = new ArrayList<>(Collections.singletonList(wallHeight));
        Map<Character, Integer> lastWall = new HashMap<Character, Integer>() {{
            put('P', 0);
            put('M', 0);
            put('G', 0);
        }};

        for (char titan : titans) {
            int titanSize = 0;
            switch (titan) {
                case 'P':
                    titanSize = titansSizes[0];
                    break;
                case 'M':
                    titanSize = titansSizes[1];
                    break;
                case 'G':
                    titanSize = titansSizes[2];
                    break;
            }

            int wallLevel = lastWall.get(titan);
            while (true) {
                if (titanSize <= wallRemain.get(wallLevel)) {
                    wallRemain.set(wallLevel, wallRemain.get(wallLevel) - titanSize);
                    break;
                } else {
                    wallLevel++;
                    lastWall.put(titan, wallLevel);
                    if (wallLevel == wallRemain.size()) {
                        wallRemain.add(wallHeight);
                    }
                }
            }
        }

        try (Writer writer = new OutputStreamWriter(System.out)) {
            new PrintWriter(writer).println(wallRemain.size());
        }
    }
}