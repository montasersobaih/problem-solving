package URI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Help {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in)/*new FileReader("Input")*/);
        int loop;
        while ((loop = Integer.parseInt(b.readLine())) != 0) {
            String[] str1 = new String[loop];
            while (loop > 0) {
                str1[(str1.length - 1) - (loop-- - 1)] = b.readLine();
            }

            int correct = 0, penalty = 0;
            for (int i = 0; i < str1.length; i++) {
                String[] str2 = str1[i].split(" ");
                if (str2[2].equals("correct")) {
                    correct++;
                    penalty += Integer.parseInt(str2[1]);
                    penalty += Incorrect(Arrays.copyOf(str1, i), str2[0].charAt(0));
                }
            }
            System.out.printf("%d %d\n", correct, penalty);
        }
    }

    private static int Incorrect(String[] str, char ch) {
        int sum = 0;
        for (int i = 0; i < str.length; i++) {
            if (ch == str[i].charAt(0)) {
                sum += 20;
            }
        }
        return sum;
    }
}