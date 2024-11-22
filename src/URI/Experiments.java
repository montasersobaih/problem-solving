package URI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Experiments {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader b = new BufferedReader(new FileReader("Input"));

        int loop = Integer.parseInt(b.readLine()), sum = 0;
        int[] x = {0, 0, 0};
        while (loop > 0) {
            StringTokenizer string = new StringTokenizer(b.readLine());

            int num = Integer.parseInt(string.nextToken());
            String str = string.nextToken();

            sum += num;
            if (str.equals("C")) {
                x[0] += num;
            } else if (str.equals("R")) {
                x[1] += num;
            } else if (str.equals("S")) {
                x[2] += num;
            }
            loop--;
        }
        BufferedWriter f = new BufferedWriter(new OutputStreamWriter(System.out));

        f.write(String.format("Total: %d cobaias\n", sum));
        f.write(String.format("Total de coelhos: %d\n", x[0]));
        f.write(String.format("Total de ratos: %d\n", x[1]));
        f.write(String.format("Total de sapos: %d\n", x[2]));
        f.write(String.format("Percentual de coelhos: %.2f %s\n", (x[0] * 100.0) / sum, "%"));
        f.write(String.format("Percentual de ratos: %.2f %s\n", (x[1] * 100.0) / sum, "%"));
        f.write(String.format("Percentual de sapos: %.2f %s\n", (x[2] * 100.0) / sum, "%"));

        f.flush();
    }
}