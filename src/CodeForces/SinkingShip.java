package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SinkingShip {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader b = new BufferedReader(new FileReader("Input"));
        String[] x = new String[Integer.parseInt(b.readLine())], y = {"ra", "woch", "ma", "ca"};

        for (int i = 0; i < x.length; i++) {
            StringTokenizer str = new StringTokenizer(b.readLine());
            x[i] = str.nextToken() + " " + str.nextToken();
        }

        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (x[j] != null) {
                    if (y[i].contains(x[j].substring(x[j].indexOf(" ") + 1, x[j].indexOf(" ") + 3))) {
                        String m = x[j].substring(0, x[j].indexOf(" "));
                        x[j] = null;
                        System.out.println(m);
                    }
                }
            }
        }
    }
}