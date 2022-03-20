package URI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class WeightedAverages {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        int test = Integer.parseInt(b.readLine());

        BufferedWriter f = new BufferedWriter(new OutputStreamWriter(System.out));
        while (test > 0) {
            StringTokenizer string = new StringTokenizer(b.readLine());
            double[] d = {Double.parseDouble(string.nextToken()) * 2,
                    Double.parseDouble(string.nextToken()) * 3,
                    Double.parseDouble(string.nextToken()) * 5};

            f.write(String.format("%.1f\n", (d[0] + d[1] + d[2]) / 10));
            test--;
        }
        f.flush();
    }
}
