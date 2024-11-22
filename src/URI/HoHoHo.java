package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962-786258874
 * @link <a href="https://judge.beecrowd.com/en/problems/view/1759">Ho Ho Ho</a>
 * @algorithm
 * @since 09-11-2022
 */

public class HoHoHo {

    public static void main(String[] args) throws IOException {
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bReader.readLine());
        try (Writer writer = new OutputStreamWriter(System.out)) {
            PrintWriter pWriter = new PrintWriter(writer);
            for (int i = 0; i < n - 1; i++) {
                pWriter.print("Ho ");
            }
            pWriter.println("Ho!");
        }
    }
}
