package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackToHighSchoolPhysics {

    public static void main(String[] abc) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while ((line = br.readLine()) != null) {
            StringTokenizer tokenizer = new StringTokenizer(line);
            System.out.println(Integer.parseInt(tokenizer.nextToken()) * Integer.parseInt(tokenizer.nextToken()) * 2);
        }
    }
}