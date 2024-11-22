package AhmedAly;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class RamiAndChildren {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int tc = parseInt(reader.readLine());
        while (tc-- > 0) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int childs = parseInt(tokenizer.nextToken());
            double candi = parseInt(tokenizer.nextToken());


            tokenizer = new StringTokenizer(reader.readLine());
            int round = 0, ID = 0;
            for (int i = 1; i <= childs; i++) {
                int child = parseInt(tokenizer.nextToken());
                int check = (int) Math.ceil(child / candi);
                if (check >= round) {
                    round = check;
                    ID = i;
                }
            }
            System.out.println(ID);
        }
    }
}
