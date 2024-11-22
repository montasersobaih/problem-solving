package URI;

import java.util.Scanner;

public class BankNotesAndCoins1 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        double money = s.nextDouble();

        StringBuilder str = new StringBuilder();
        str.append("NOTAS:\n");

        double[] fraction = {100, 50, 20, 10, 5, 2, 1.00, 0.50, 0.25, 0.10, 0.05, 0.01};
        int gate = 1;
        for (int i = 0; i < fraction.length; i++) {
            if (i <= 5) {
                int count = 0;
                while (money >= fraction[i]) {
                    money -= fraction[i];
                    count++;
                }
                str.append(String.format("%d nota(s) de R$ %d.00\n", count, (int) fraction[i]));
            } else {
                if (gate == 1) {
                    str.append("MOEDAS:\n");
                    gate = 0;
                }

                int count = 0;
                while (money >= fraction[i]) {
                    money -= fraction[i];
                    count++;
                }
                str.append(String.format("%d moeda(s) de R$ %.2f\n", count, fraction[i]));
            }
        }
        System.out.print(str);
        s.close();
        System.exit(0);
    }
}
