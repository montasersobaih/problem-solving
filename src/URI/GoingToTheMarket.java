package URI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GoingToTheMarket {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        int test = Integer.parseInt(b.readLine());
        while (test > 0) {
            int loop = Integer.parseInt(b.readLine());
            Vegetables[] veg = new Vegetables[loop];
            for (int i = 0; i < loop; i++) {
                StringTokenizer string = new StringTokenizer(b.readLine());
                veg[i] = new Vegetables(string.nextToken(), Double.parseDouble(string.nextToken()));
            }

            loop = Integer.parseInt(b.readLine());
            double sum = 0.0;
            for (int i = 0; i < loop; i++) {
                StringTokenizer string = new StringTokenizer(b.readLine());
                String str = string.nextToken();
                double kilo = Integer.parseInt(string.nextToken());

                for (int j = 0; j < veg.length; j++) {
                    if (str.equals(veg[j].name)) {
                        sum += (kilo * veg[j].price);
                        break;
                    }
                }
            }
            System.out.printf("R$ %.2f\n", sum);
            test--;
        }
    }

    private static class Vegetables {
        protected String name;
        protected double price;

        public Vegetables(String name, double price) {
            this.name = name;
            this.price = price;
        }
    }

}