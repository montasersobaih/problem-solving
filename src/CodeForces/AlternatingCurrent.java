package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @since 21-03-2022
 */

public class AlternatingCurrent {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = reader.readLine().toCharArray();

        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        String ans = "YES";
        if (!stack.isEmpty()) {
            ans = "NO";
        }

        System.out.println(ans);
    }
}
