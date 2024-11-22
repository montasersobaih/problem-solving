package URI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class TriangleTypes {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer string = new StringTokenizer(br.readLine());

        double[] a = {Double.parseDouble(string.nextToken()),
                Double.parseDouble(string.nextToken()),
                Double.parseDouble(string.nextToken())};

        Arrays.sort(a);

        double[] b = {Math.pow(a[2], 2), Math.pow(a[1], 2), Math.pow(a[0], 2)};

        BufferedWriter f = new BufferedWriter(new OutputStreamWriter(System.out));

        if (a[2] >= (a[1] + a[0])) {
            f.write("NAO FORMA TRIANGULO\n");
        } else if (b[0] == (b[1] + b[2])) {
            f.write("TRIANGULO RETANGULO\n");
        } else if (b[0] > (b[1] + b[2])) {
            f.write("TRIANGULO OBTUSANGULO\n");
        } else if (b[0] < (b[1] + b[2])) {
            f.write("TRIANGULO ACUTANGULO\n");
        }

        if (a[2] == a[1] && a[2] == a[0] && a[1] == a[0]) {
            f.write("TRIANGULO EQUILATERO\n");
        } else if (a[2] == a[1] || a[2] == a[0] || a[1] == a[0]) {
            f.write("TRIANGULO ISOSCELES\n");
        }
        f.flush();
        f.close();
        br.close();
    }
}
