package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962786258874
 * @link https://codeforces.com/group/MUjDsRjHXt/contest/302066/problem/G
 * @since 01-06-2022
 */

class ChipsSolution1 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int w = Integer.parseInt(tokenizer.nextToken());
        int c = Integer.parseInt(tokenizer.nextToken());
        for (int i = 0; c - i > 0; i = i % w) {
            c -= (++i);
        }

        System.out.println(c);
    }
}

class ChipsSolution2 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        Queue<Integer> queue = new LinkedList<>();

        int w = Integer.parseInt(tokenizer.nextToken());
        for (int i = 1; i <= w; i++) {
            queue.offer(i);
        }

        int c = Integer.parseInt(tokenizer.nextToken());
        while (!queue.isEmpty()) {
            int x = queue.poll();

            if (c - x >= 0) {
                c -= x;
            } else {
                break;
            }

            queue.offer(x);
        }

        System.out.println(c);
    }
}