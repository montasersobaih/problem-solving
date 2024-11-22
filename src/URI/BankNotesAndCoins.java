package URI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BankNotesAndCoins {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        double money = Double.parseDouble(b.readLine());

        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));

        bf.write("NOTAS:\n");

        int[] moneybank = {100, 50, 20, 10, 5, 2};
        for (int i = 0; i < moneybank.length; i++) {
            int count = 0;
            while (money >= moneybank[i]) {
                money -= moneybank[i];
                count++;
            }
            bf.write(String.format("%d nota(s) de R$ %d.00\n", count, moneybank[i]));
        }

        bf.write("MOEDAS:\n");

        double[] fraction = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};
        for (int i = 0; i < fraction.length; i++) {
            int count = 0;
            while (money >= fraction[i]) {
                money -= fraction[i];
                count++;
            }
            bf.write(String.format("%d moeda(s) de R$ %.2f\n", count, fraction[i]));
        }
        bf.flush();
        b.close();
        bf.close();
    }
}