package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962786258874
 * @link https://codeforces.com/group/MUjDsRjHXt/contest/302066/problem/I
 * @since 01-06-2022
 */

class RoundingSolution1 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());

        int firstDigit = number % 10;
        if (firstDigit >= 5) {
            number += 10;
        }

        System.out.println(number - firstDigit);
    }
}

class RoundingSolution2 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());
        number += (number % 10) >= 5 ? 10 - (number % 10) : -(number % 10);
        System.out.println(number);
    }
}
