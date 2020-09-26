package URI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SimpleCalculate {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer string = new StringTokenizer(b.readLine());

        string.nextToken();
        double price = Integer.parseInt(string.nextToken()) * Double.parseDouble(string.nextToken());

        string = new StringTokenizer(b.readLine());

        string.nextToken();
        double price2 = Integer.parseInt(string.nextToken()) * Double.parseDouble(string.nextToken());

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", (price + price2));
    }
}
