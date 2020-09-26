package URI;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SquareMatrixI {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int length;
        while ((length = Integer.parseInt(b.readLine())) != 0) {
            int[] x = new int[length];
            for (int i = 0, j = length - 1; i < length; i++, j--) {
                if (i <= j) {
                    for (int k = i; k <= j; k++) {
                        x[k]++;
                    }
                } else {
                    for (int k = j + 1; k < i; k++) {
                        x[k]--;
                    }
                }
                for (int k = 0; k < length; k++) {
                    System.out.print((k + 1 == length) ? String.format("%3d", x[k]) : String.format("%3d ", x[k]));
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}