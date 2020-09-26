package URI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SalaryIncrease {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter f = new BufferedWriter(new OutputStreamWriter(System.out));
        double salary = Double.parseDouble(b.readLine()), increase = 0.0;
        int str = 0;

        if (salary >= 0.0 && salary <= 400.00) {
            str = 15;
            increase = (salary * 15) / 100;
            salary += increase;
        } else if (salary >= 400.01 && salary <= 800.00) {
            str = 12;
            increase = (salary * 12) / 100;
            salary += increase;
        } else if (salary >= 800.01 && salary <= 1200.00) {
            str = 10;
            increase = (salary * 10) / 100;
            salary += increase;
        } else if (salary >= 1200.01 && salary <= 2000.00) {
            str = 7;
            increase = (salary * 7) / 100;
            salary += increase;
        } else {
            str = 4;
            increase = (salary * 4) / 100;
            salary += increase;
        }

        f.write(String.format("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %d %c\n",
                salary, increase, str, '%'));

        f.flush();
        f.close();
        b.close();
    }
}
