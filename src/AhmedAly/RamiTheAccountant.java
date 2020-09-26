package AhmedAly;

import java.util.Scanner;

public class RamiTheAccountant {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int loop = s.nextInt();
        String g = "";
        while (loop-- > 0) {
            String Name = s.next();
            int Money = s.nextInt(), loop2 = s.nextInt(), money;
            while (loop2-- > 0) {
                String q = s.next();
                money = s.nextInt();
                if ((q).equals("buy")) {
                    Money -= money;
                } else {
                    Money += money;
                }
            }
            g += (Name + " " + Money + "\n");
        }
        System.out.print(g);
    }
}