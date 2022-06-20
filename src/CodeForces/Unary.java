package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962786258874
 * @link https://codeforces.com/group/MUjDsRjHXt/contest/302066/problem/B
 * @since 01-06-2022
 */

class UnarySolution1 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            switch (c) {
                case '>':
                    builder.append("1000");
                    break;
                case '<':
                    builder.append("1001");
                    break;
                case '+':
                    builder.append("1010");
                    break;
                case '-':
                    builder.append("1011");
                    break;
                case '.':
                    builder.append("1100");
                    break;
                case ',':
                    builder.append("1101");
                    break;
                case '[':
                    builder.append("1110");
                    break;
                case ']':
                    builder.append("1111");
                    break;
            }
        }

        System.out.println(new BigInteger(builder.toString(), 2).mod(new BigInteger("1000003")));
    }
}

class UnarySolution2 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int size = 0;
        String unary = reader.readLine();
        for (int i = 0; i < unary.length(); i++) {
            size *= 16;
            if (unary.charAt(i) == '>')
                size += 8;
            else if (unary.charAt(i) == '<')
                size += 9;
            else if (unary.charAt(i) == '+')
                size += 10;
            else if (unary.charAt(i) == '-')
                size += 11;
            else if (unary.charAt(i) == '.')
                size += 12;
            else if (unary.charAt(i) == ',')
                size += 13;
            else if (unary.charAt(i) == '[')
                size += 14;
            else if (unary.charAt(i) == ']')
                size += 15;

            size %= 1000003;
        }

        System.out.println(size);
    }
}