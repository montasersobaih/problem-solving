package URI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962-786258874
 * @link <a href="https://judge.beecrowd.com/en/problems/view/1534">Array 123</a>
 * @algorithm
 * @since 09-11-2022
 */

class Array123Solution1 {

    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter f = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = null;
        while ((str = b.readLine()) != null) {
            int a = Integer.parseInt(str);
            char[][] x = new char[a][a];
            for (int i = 0, k = (a - 1); i < a; i++, k--) {
                for (int j = 0; j < a; j++) {
                    x[i][j] = '3';
                }
                x[i][i] = '1';
                x[i][k] = '2';
                f.write(new StringBuilder(new String(x[i])).append("\n").toString());
            }
        }
        f.flush();
    }
}

class Array123Solution2 {

    public static void main(String[] args) throws IOException {
        Queue<String> cases = new LinkedList<>();

        try (BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = bReader.readLine()) != null) {
                cases.offer(line);
            }
        }

        try (BufferedWriter f = new BufferedWriter(new OutputStreamWriter(System.out))) {
            while (!cases.isEmpty()) {
                int a = Integer.parseInt(cases.poll());

                char[][] x = new char[a][a];
                for (int i = 0, k = (a - 1); i < a; i++, k--) {
                    for (int j = 0; j < a; j++) {
                        x[i][j] = '3';
                    }

                    x[i][i] = '1';
                    x[i][k] = '2';

                    f.write(new StringBuilder(new String(x[i])).append("\n").toString());
                }
            }
        }
    }
}
