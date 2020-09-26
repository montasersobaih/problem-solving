package URI;

import java.util.Scanner;

public class CoordinatesOfAPoint {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double x = s.nextDouble(), y = s.nextDouble();
        String str = null;

        if (x == 0 && y == 0) {
            str = "Origem";
        } else if (x != 0 && y == 0) {
            str = "Eixo X";
        } else if (y != 0 && x == 0) {
            str = "Eixo Y";
        } else if (x > 0 && y > 0) {
            str = "Q1";
        } else if (x < 0 && y > 0) {
            str = "Q2";
        } else if (x < 0 && y < 0) {
            str = "Q3";
        } else if (x > 0 && y < 0) {
            str = "Q4";
        }
        System.out.println(str);
        System.exit(0);
    }
}