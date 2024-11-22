package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class Bazinga {

    private static final Map<String, List<String>> map = new HashMap<>();

    static {
        map.put("tesoura", Arrays.asList("papel", "lagarto"));
        map.put("pedra", Arrays.asList("lagarto", "tesoura"));
        map.put("papel", Arrays.asList("pedra", "Spock"));
        map.put("Spock", Arrays.asList("tesoura", "pedra"));
        map.put("lagarto", Arrays.asList("Spock", "papel"));
    }

    public static void main(String[] args) throws IOException {
        Queue<String> cases = new LinkedList<>();

        try (Reader reader = new InputStreamReader(System.in)) {
            BufferedReader bReader = new BufferedReader(reader);

            int loop = Integer.parseInt(bReader.readLine());
            while (loop-- > 0) {
                cases.offer(bReader.readLine());
            }
        }

        try (Writer writer = new OutputStreamWriter(System.out)) {
            PrintWriter pWriter = new PrintWriter(writer);

            int caseNumber = 0;
            while (!cases.isEmpty()) {
                StringTokenizer tokenizer = new StringTokenizer(cases.poll());

                String player1 = tokenizer.nextToken();
                String player2 = tokenizer.nextToken();

                String result;
                if (player1.equals(player2)) {
                    result = "De novo!";
                } else {
                    List<String> values1 = map.get(player1);
                    if (values1.contains(player2)) {
                        result = "Bazinga!";
                    } else {
                        result = "Raj trapaceou!";
                    }
                }
                pWriter.println("Caso #" + ++caseNumber + ": " + result);
            }
        }
    }
}