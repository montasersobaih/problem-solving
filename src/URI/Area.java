package URI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Area {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer string = new StringTokenizer(b.readLine());

        double A = Double.parseDouble(string.nextToken());
        double B = Double.parseDouble(string.nextToken());
        double C = Double.parseDouble(string.nextToken());

        System.out.printf("TRIANGULO: %.3f\n", ((A / 2) * C));
        System.out.printf("CIRCULO: %.3f\n", (3.14159) * Math.pow(C, 2));
        System.out.printf("TRAPEZIO: %.3f\n", ((A + B) * C) / 2);
        System.out.printf("QUADRADO: %.3f\n", (Math.pow(B, 2)));
        System.out.printf("RETANGULO: %.3f\n", (A * B));
    }
}
