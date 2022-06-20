package CodeForces;

import java.io.File;
import java.util.Scanner;

public class SelfDescribingNumbers {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(new File("self.in"));

        int x = input.nextInt();
        for (int i = 0; i < x; i++) {
            String number = input.next();

            String answer = "self-describing";
            for (int j = 0; j < number.length(); j++) {
                int count = 0;
                for (int k = 0; k < number.length(); k++) {
                    if (number.charAt(k) - '0' == j) {
                        count++;
                    }
                }

                if (!(count == Integer.parseInt(number.charAt(j) + ""))) {
                    answer = "not self-describing";
                    break;
                }
            }

            System.out.println(answer);
        }
    }
}