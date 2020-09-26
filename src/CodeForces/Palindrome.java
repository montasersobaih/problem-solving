package CodeForces;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class Palindrome {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new FileReader("Input"));
//        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));

        int loop = parseInt(b.readLine());
        while (loop-- > 0) {
            StringTokenizer token = new StringTokenizer(b.readLine());
            int length = parseInt(token.nextToken()), constraint = parseInt(token.nextToken());
            char[] c = b.readLine().toCharArray();

            boolean f = true;
            for (int i = 0; i < constraint; i++) {
                token = new StringTokenizer(b.readLine());
                int[] y = {parseInt(token.nextToken()) - 1, parseInt(token.nextToken()) - 1};
                if (Character.isLetter(c[y[0]]) && Character.isLetter(c[y[1]])) {
                    if (c[y[0]] != c[y[1]]) {
                        f = false;
                    }
                }
            }
            b.readLine();

            if (f) {
                int count = 0;
                for (int i = 0, j = (c.length - 1); i <= j; i++, j--) {
                    if (c[i] != c[j]) {
                        if (Character.isLetter(c[i]) && (c[j] == '?')) {
                            c[j] = c[i];
                        } else if (Character.isLetter(c[j]) && (c[i] == '?')) {
                            c[i] = c[j];
                        } else {
                            f = false;
                            break;
                        }
                    } else if ((c[i] == '?') && (c[j] == '?')) {
                        count++;
                    }
                }
                if (f) {
                    bf.write((new BigInteger("26").pow(count)).mod(new BigInteger("1000000007")).toString() + "\n");
                } else {
                    bf.write("0\n");
                }
            } else {
                bf.write("0\n");
            }
        }
        bf.flush();
    }
}