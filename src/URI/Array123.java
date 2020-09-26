package URI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Array123 {
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
