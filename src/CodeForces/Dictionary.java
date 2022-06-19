package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962786258874
 * @link https://codeforces.com/contest/1674/problem/B
 * @since 19-06-2022
 */

class DictionarySolution1 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(reader.readLine());
        while (tc-- > 0) {
            char[] chars = reader.readLine().toCharArray();
            System.out.println(25 * (chars[0] - 'a') + (chars[1] - 'a') + (chars[0] < chars[1] ? 0 : 1));
        }
    }
}

class DictionarySolution2 {//A solution faster than solution-1

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(reader.readLine());
        char[][] chars = new char[tc][];
        for (int i = 0; i < tc; i++) {
            chars[i] = reader.readLine().toCharArray();
        }

        for (int i = 0; i < tc; i++) {
            System.out.println(25 * (chars[i][0] - 'a') + (chars[i][1] - 'a') + (chars[i][0] < chars[i][1] ? 0 : 1));
        }
    }
}
