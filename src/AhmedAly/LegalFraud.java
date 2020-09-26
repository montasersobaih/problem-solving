package AhmedAly;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import static java.lang.String.format;

public class LegalFraud {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        StringTokenizer tokenizer = null;
        String BA = null;

        double money = 0D, withdraw = 0D, revenu = 0D;
        List<String> name = new LinkedList<String>();
        Map<String, Double> account = new HashMap<String, Double>();

        int loop = parseInt(reader.readLine());
        while (loop-- > 0) {
            tokenizer = new StringTokenizer(reader.readLine());
            BA = tokenizer.nextToken().concat(" ").concat(tokenizer.nextToken());
            money = parseDouble(tokenizer.nextToken().substring(1));

            name.add(BA);
            account.put(BA, money);
        }

        loop = parseInt(reader.readLine());
        while (loop-- > 0) {
            tokenizer = new StringTokenizer(reader.readLine());
            BA = tokenizer.nextToken().concat(" ").concat(tokenizer.nextToken());
            withdraw = parseDouble(tokenizer.nextToken().substring(1));

            money = account.get(BA);
            double fraction = money % ((int) money);
            double fee = (int) (((fraction * withdraw) / (int) money) * 100);
            fee = fee / 100;

            money -= (withdraw + fee);
            account.put(BA, money);
            revenu += fee;

        }

        while (!name.isEmpty()) {
            String ac = name.remove(0);
            builder.append(ac).append(" ").append(format("$%.2f\n", account.remove(ac)));
        }
        System.out.println(builder.append(format("$%.2f", revenu)));
    }
}
