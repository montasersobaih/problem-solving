package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class KindergartenCountingGame {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while ((line = reader.readLine()) != null) {
            line = line.replaceAll("\\s?[^A-z]+\\s?", " ");
            System.out.println(new StringTokenizer(line).countTokens());
        }
    }
}