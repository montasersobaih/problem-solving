package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962786258874
 * @link https://codeforces.com/group/MUjDsRjHXt/contest/302066/problem/A
 * @since 01-06-2022
 */

class HQ9PlusSolution1 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String replaced = reader.readLine().replaceAll("[^HQ9]", "");
        System.out.println(replaced.length() > 0 ? "YES" : "NO");
    }
}

class HQ9PlusSolution2 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        String answer = "NO";
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if ("HQ9".contains(Character.toString(c))) {
                answer = "YES";
                break;
            }
        }

        System.out.println(answer);
    }
}

