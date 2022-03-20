package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class MakeCents {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(b.readLine());
        for (int i = 0; i < num; i++) {
            HashMap<String, Double> map = new HashMap<String, Double>();

            StringTokenizer tok = new StringTokenizer(b.readLine());
            int c = Integer.parseInt(tok.nextToken()), n = Integer.parseInt(tok.nextToken());
            for (int j = 0; j < c; j++) {
                tok = new StringTokenizer(b.readLine());
                map.put(tok.nextToken(), Double.parseDouble(tok.nextToken()));
            }
            map.put("JD", 1.0);

            double r = 0.0;
            for (int j = 0; j < n; j++) {
                tok = new StringTokenizer(b.readLine());
                double x = Double.parseDouble(tok.nextToken());
                String xx = tok.nextToken();
                r += (map.get(xx) * x);
            }
            System.out.printf("%.6f\n", r);
        }
    }
}
