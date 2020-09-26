package URI;

import java.util.Scanner;

public class Combiner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int loop = s.nextInt();
        while (loop-- > 0) {
            char[] one = s.next().toCharArray();
            char[] two = s.next().toCharArray();

            StringBuilder builder = new StringBuilder();
            int loop2 = Math.max(one.length, two.length);
            for (int i = 0; i < loop2; i++) {
                if (i < one.length) {
                    builder.append(one[i]);
                }
                if (i < two.length) {
                    builder.append(two[i]);
                }
            }
            System.out.println(builder);
        }
    }
}