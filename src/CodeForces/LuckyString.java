package CodeForces;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class LuckyString {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter f = new BufferedWriter(new OutputStreamWriter(System.out));
        int length = Integer.parseInt(b.readLine());
        char c = 'a';
        for (int i = 0; i < length; i++) {
            if (c == 'e') {
                c = 'a';
                f.write(Character.toString(c));
            } else {
                f.write(Character.toString(c));
            }
            c++;
        }
        f.newLine();
        f.flush();
    }
}