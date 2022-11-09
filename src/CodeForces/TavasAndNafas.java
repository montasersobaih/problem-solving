package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962-786258874
 * @link https://codeforces.com/problemset/problem/535/A
 * @since 29-10-2022
 */

public class TavasAndNafas {

    private static final String[][] words = {
            {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"},
            {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"},
            {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"}
    };

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();
        int number = Integer.parseInt(line);

        System.out.println(number > 0 ? convert(number) : "zero");
    }

    private static String convert(int number) {
        if (number < 10) {
            return words[number / 10][number];
        } else if (number < 20) {
            return words[number / 10][number % 10];
        } else {
            String tens = words[2][number / 10];
            String single = convert(number % 10);
            return single.isEmpty() ? tens : String.join("-", tens, single);
        }
    }
}
