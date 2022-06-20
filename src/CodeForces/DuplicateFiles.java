package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class DuplicateFiles {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(reader.readLine());
        while (tc-- > 0) {
            Map<String, Integer> files = new HashMap<>();

            int length = Integer.parseInt(reader.readLine());
            for (int i = 0; i < length; i++) {
                String[] split = reader.readLine().split(" ");
                String fileName = split[0];
                int newId = Integer.parseInt(split[1]);

                Integer id = files.getOrDefault(fileName, null);
                if (id != null) {
                    if (newId < id) {
                        files.put(split[0], newId);
                    }
                } else {
                    files.put(split[0], newId);
                }
            }

            StringJoiner joiner = new StringJoiner(" ");
            files.values()
                    .stream()
                    .sorted()
                    .map(id -> id + "")
                    .forEach(joiner::add);
            System.out.println(joiner);
        }
    }
}