package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class WordScramble {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while ((line = reader.readLine()) != null) {
            StringJoiner joiner = new StringJoiner(" ");

            StringTokenizer tokenizer = new StringTokenizer(line);
            while (tokenizer.hasMoreTokens()) {
                String token = tokenizer.nextToken();
                joiner.add(new StringBuilder(token).reverse());
            }

            System.out.println(joiner);
        }
    }
}