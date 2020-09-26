package URI;

import java.util.Scanner;

public class EvenOddPositiveandNegative {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int even = 0, odd = 0, pos = 0, neg = 0;

        for (int i = 0; i < 5; i++) {
            int f = s.nextInt();

            if (f % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            if (f > 0) {
                pos++;
            } else if (f < 0) {
                neg++;
            }
        }
        System.out.printf("%d valor(es) par(es)\n", even);
        System.out.printf("%d valor(es) impar(es)\n", odd);
        System.out.printf("%d valor(es) positivo(s)\n", pos);
        System.out.printf("%d valor(es) negativo(s)\n", neg);
    }
}
