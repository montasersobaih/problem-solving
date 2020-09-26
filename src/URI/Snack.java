package URI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Snack {
    public static void main(String[] args) throws Exception {
        double[] x = {4.00, 4.50, 5.00, 2.00, 1.50};
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer string = new StringTokenizer(b.readLine());

        BufferedWriter f = new BufferedWriter(new OutputStreamWriter(System.out));
        f.write(String.format("Total: R$ %.2f\n", x[Integer.parseInt(string.nextToken()) - 1] *
                Integer.parseInt(string.nextToken())));

        f.flush();
        f.close();
        b.close();

    }
}
