package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962786258874
 * @link https://codeforces.com/group/MUjDsRjHXt/contest/302066/problem/D
 * @since 01-06-2022
 */

class FileNameSolution1 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(reader.readLine());
        char[] chars = new char[length];
        for (int i = 0; i < length; i++) {
            char c = (char) reader.read();
            if (c == 'x') {
                chars[i] = c;
            } else {
                chars[i] = ' ';
            }
        }

        int sum = 0;
        StringTokenizer tokenizer = new StringTokenizer(new String(chars));
        while (tokenizer.hasMoreTokens()) {
            int wLength = tokenizer.nextToken().length();
            if (wLength > 2) {
                sum += (wLength - 2);
            }
        }

        System.out.println(sum);
    }
}

class FileNameSolution2 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(reader.readLine());

        int countX = 0, sum = 0;
        for (int i = 0; i < length; i++) {
            char c = (char) reader.read();
            if (c == 'x') {
                if (++countX > 2) {
                    sum++;
                }
            } else {
                countX = 0;
            }
        }

        System.out.println(sum);
    }
}
