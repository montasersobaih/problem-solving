package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Borze {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        int decode[] = new int[201];
        int digit = 0;

        int c = 0;
        while ((c = reader.read()) != -1 && c != ' ' && c != '\n' && c != '\r') {
            if (c == '-') {
                if (++decode[digit] == 2) {
                    digit++;
                }
            } else {
                digit++;
            }
        }

        if (digit != 0) {
            for (int i = 0; i < digit; i++) {
                builder.append(decode[i]);
            }
            System.out.println(builder);
        } else {
            System.out.println(decode[digit]);
        }
    }
}
