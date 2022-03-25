package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PowerString {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while (!(line = reader.readLine()).equals(".")) {
            int concatNumber = 1;

            for (int i = 2; i <= line.length(); i++) {
                if (line.length() % i == 0) {
                    int half = (line.length() / i), gate = 1;

                    for (int first = 0, last = half; last < line.length(); first++, last++) {
                        if (line.charAt(first) != line.charAt(last)) {
                            gate = 0;
                            break;
                        }
                    }

                    if (gate == 1) {
                        concatNumber = i;
                    }
                }
            }

            System.out.println(concatNumber);
        }
    }
}