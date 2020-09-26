package URI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class InfixToPosfix {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(b.readLine());
        while (loop-- > 0) {
            String str1 = "(" + b.readLine() + ")";
            StringBuilder builder = new StringBuilder();
            Stack<Character> stack = new Stack<Character>();
            for (int i = 0; i < str1.length(); i++) {
                char c = str1.charAt(i);
                if (Character.isLetterOrDigit(c)) {
                    builder.append(c);
                } else {
                    if (c == '(') {
                        stack.push(c);
                    } else if (c == '+' || c == '-') {
                        if (stack.peek() != '(') {
                            while (stack.peek() != '(') {
                                builder.append(stack.pop());
                            }
                            stack.push(c);
                        } else {
                            stack.push(c);
                        }
                    } else if (c == '*' || c == '/') {
                        if (stack.peek() != '+' && stack.peek() != '-' && stack.peek() != '(') {
                            while (stack.peek() != '+' && stack.peek() != '-' && stack.peek() != '(') {
                                builder.append(stack.pop());
                            }
                            stack.push(c);
                        } else {
                            stack.push(c);
                        }
                    } else if (c == ')') {
                        while (stack.peek() != '(') {
                            builder.append(stack.pop());
                        }
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                }
            }
            while (!stack.isEmpty()) {
                builder.append(stack.pop());
            }
            System.out.println(builder);
        }
    }
}