package URI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TypeofFuel {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter f = new BufferedWriter(new OutputStreamWriter(System.out));

        f.write("MUITO OBRIGADO\n");
        int[] x = {Integer.parseInt(b.readLine()), 0, 0, 0};
        while (x[0] != 4) {
            if (x[0] >= 1 && x[0] <= 3) {
                if (x[0] == 1) {
                    x[1]++;
                } else if (x[0] == 2) {
                    x[2]++;
                } else if (x[0] == 3) {
                    x[3]++;
                }
            }
            x[0] = Integer.parseInt(b.readLine());
        }
        f.write(String.format("Alcool: %d\nGasolina: %d\nDiesel: %d\n",
                x[1], x[2], x[3]));
        f.flush();
    }
}
