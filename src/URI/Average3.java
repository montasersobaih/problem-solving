package URI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Average3 {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer string = new StringTokenizer(b.readLine());

        double A = Double.parseDouble(string.nextToken()) * 2,
                B = Double.parseDouble(string.nextToken()) * 3,
                C = Double.parseDouble(string.nextToken()) * 4,
                D = Double.parseDouble(string.nextToken()) * 0.9,
                Average = (A + B + C + D) / (2 + 3 + 4 + 0.9);

        BufferedWriter f = new BufferedWriter(new OutputStreamWriter(System.out));

        if (Average >= 7) {
            f.write(String.format("Media: %.1f\nAluno aprovado.\n", Average));
        } else if (Average < 5) {
            f.write(String.format("Media: %.1f\nAluno reprovado.\n", Average));
        } else {
            f.write(String.format("Media: %.1f\nAluno em exame.\n", Average));
            double R = Double.parseDouble(b.readLine()),
                    newSum = (R + Average) / 2;

            if (newSum >= 5) {
                f.write(String.format("Nota do exame: %.1f\nAluno aprovado.\n", R));
            } else {
                f.write(String.format("Nota do exame: %.1f\nAluno reprovado.\n", R));
            }

            f.write(String.format("Media final: %.1f\n", newSum));
        }
        f.flush();
        f.close();
        b.close();
    }
}