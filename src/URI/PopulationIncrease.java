package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class PopulationIncreaseSolution1 {

}

class PopulationIncreaseSolution2 {

    public static void main(String[] args) throws IOException {
        Reader reader = new InputStreamReader(System.in);
        BufferedReader bReader = new BufferedReader(reader);

        Queue<String> cases = new LinkedList<>();
        int tc = Integer.parseInt(bReader.readLine());
        while (tc-- > 0) {
            cases.offer(bReader.readLine());
        }

        try (PrintWriter pWriter = new PrintWriter(System.out)) {
            while (!cases.isEmpty()) {
                StringTokenizer tokenizer = new StringTokenizer(cases.poll());
                int c1p = Integer.parseInt(tokenizer.nextToken());
                int c2p = Integer.parseInt(tokenizer.nextToken());

                float g1p = (Float.parseFloat(tokenizer.nextToken()) / 100) + 1;
                float g2p = (Float.parseFloat(tokenizer.nextToken()) / 100) + 1;

                int minimumYears = 0;
                while (c1p <= c2p && minimumYears <= 100) {
                    c1p = (int) (c1p * g1p);
                    c2p = (int) (c2p * g2p);
                    minimumYears++;

                }

                if (minimumYears > 100) {
                    pWriter.println("Mais de 1 seculo.");
                } else {
                    pWriter.printf("%d anos.\n", minimumYears);
                }
            }
        }
    }
}
