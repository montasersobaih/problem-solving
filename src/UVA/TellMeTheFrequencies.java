package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TellMeTheFrequencies {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder builder = new StringBuilder();

        String line;
        while ((line = reader.readLine()) != null) {
            char[] chars = line.toCharArray();

            TreeMap<Integer, Integer> map = new TreeMap<>();
            for (char c : chars) {
                int asc = c;

                Integer count = map.get(asc);
                if (Objects.isNull(count)) {
                    map.put(asc, 1);
                } else {
                    map.put(asc, count + 1);
                }
            }

            Set<Map.Entry<Integer, Integer>> set = new TreeSet<>((o1, o2) -> {
                if (o1.getValue() < o2.getValue()) {
                    return -1;
                } else if (o1.getValue() == o2.getValue() && o1.getKey() > o2.getKey()) {
                    return -1;
                }

                return 1;
            });

            set.addAll(map.entrySet());
            for (Map.Entry<Integer, Integer> entry : set) {
                builder.append(entry.getKey() + " " + entry.getValue() + "\n");
            }
            builder.append("\n");
        }

        builder.deleteCharAt(builder.length() - 1);
        builder.deleteCharAt(builder.length() - 1);
        System.out.println(builder);
    }
}
