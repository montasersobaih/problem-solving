package URI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.StringJoiner;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962786258874
 * @link https://www.beecrowd.com.br/judge/en/problems/view/1258
 * @since 04-11-2022
 */

public class TShirts {

    public static void main(String[] args) throws Exception {
        InputStreamReader inputStream = new InputStreamReader(System.in);

        StringJoiner joiner1 = new StringJoiner("\n");
        try (BufferedReader reader = new BufferedReader(inputStream)) {
            int tc = 0;

            while ((tc = Integer.parseInt(reader.readLine())) != 0) {
                List<TShirt> tShirts = new LinkedList<>();

                while (tc-- > 0) {
                    String name = reader.readLine();
                    String[] details = reader.readLine().split(" ");

                    tShirts.add(new TShirt(name, details[0], details[1]));
                }

                Collections.sort(tShirts);

                StringJoiner joiner2 = new StringJoiner("\n", "", "\n");
                for (TShirt tShirt : tShirts) {
                    joiner2.add(tShirt.toString());
                }

                joiner1.add(joiner2.toString());
            }
        }

        System.out.print(joiner1);
    }

    private static class TShirt implements Comparable<TShirt> {

        private final String name, color, size;

        TShirt(String name, String color, String size) {
            this.name = name;
            this.color = color;
            this.size = size;
        }

        @Override
        public int compareTo(TShirt o) {
            int index = this.color.compareTo(o.color);
            if (index == 0) {
                index = o.size.compareTo(this.size);
                if (index == 0) {
                    index = this.name.compareTo(o.name);
                }
            }

            return index;
        }

        @Override
        public String toString() {
            return String.format("%s %s %s", color, size, name);
        }
    }
}