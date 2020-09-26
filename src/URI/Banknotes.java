package URI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Banknotes {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int money = Integer.parseInt(b.readLine());

        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));

        bf.write(money + "\n");
        int[] moneybank = {100, 50, 20, 10, 5, 2, 1};
        for (int i = 0; i < moneybank.length; i++) {
            int count = 0;
            while (money >= moneybank[i]) {
                money -= moneybank[i];
                count++;
            }
            bf.write(String.format("%d nota(s) de R$ %d,00\n", count, moneybank[i]));
        }
        bf.flush();

        b.close();
        bf.close();
    }
}
