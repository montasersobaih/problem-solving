package CodeForces;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class CapitalCity {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new FileReader("Input"));
//        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        class City {
            int cityNum, distance;
            boolean visit;

            City(int c, int d) {
                this.cityNum = c;
                this.distance = d;
                this.visit = false;
            }
        }

        int loop = parseInt(b.readLine());
        while (loop-- > 0) {
            String[] x = b.readLine().split(" ");
            ArrayList<City>[] a = new ArrayList[parseInt(x[0])];

            int loop2 = parseInt(x[1]), index = 0;
            while (loop2-- > 0) {
                x = b.readLine().split(" ");
                index = parseInt(x[0]) - 1;

                if (a[index] != null) {
                    a[index].add(new City(parseInt(x[1]), parseInt(x[2])));
                } else {
                    a[index] = new ArrayList();
                    a[index].add(new City(parseInt(x[1]), parseInt(x[2])));
                }
            }

            for (int i = 0; i < a.length; i++) {
                if (a[i] != null) {
                    System.out.print(i + 1 + " ");
                    while (!a[i].isEmpty()) {
                        City c = a[i].remove(0);
                        System.out.print("-> " + c.cityNum + "|" + c.distance + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}