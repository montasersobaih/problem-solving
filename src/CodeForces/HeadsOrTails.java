package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class HeadsOrTails {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String[] x = b.readLine().split(" ");
        int[] y = new int[x.length];
        for (int i = 0; i < y.length; i++) {
            y[i] = Integer.parseInt(x[i]);
        }

        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = y[2]; i <= y[0]; i++) {
            for (int j = y[3]; j <= y[1]; j++) {
                if (i > j) {
                    ar.add(i);
                    ar.add(j);
                }
            }
        }

        System.out.println(ar.size() / 2);
        for (int i = 0; i < ar.size(); i += 2) {
            System.out.format("%d %d%n", ar.get(i), ar.get(i + 1));
        }
    }
}