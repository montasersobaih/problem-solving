package URI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class SortSortAndSort {
    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new FileReader("Input"));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(tokenizer.nextToken());
        int M = Integer.parseInt(tokenizer.nextToken());
        StringBuilder builder = new StringBuilder();

        /*move class and comparator outside the while loop*/
        class Pair {
            int number;
            int mode;
            boolean odd;
        }

        Comparator<Pair> comparator = new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if (o1.mode < o2.mode) {
                    return -1;
                }
                if (o1.mode == o2.mode) {
                    if (o1.odd && !o2.odd) {
                        return -1;
                    } else if (!o1.odd && o2.odd) {
                        return 1;
                    } else if (o1.odd) {
                        if (o1.number > o2.number) {
                            return -1;
                        } else {
                            return 1;
                        }
                    } else {
                        if (o2.number > o1.number) {
                            return -1;
                        } else {
                            return 1;
                        }
                    }
                }
                return 0;
            }
        };

        while (N != 0 && M != 0) {
            TreeMap<Integer, List<Pair>> map = new TreeMap<Integer, List<Pair>>();
            for (int i = 0; i < N; ++i) {
                Pair pair = new Pair();
                pair.number = Integer.parseInt(reader.readLine());
                pair.mode = pair.number % M;
                pair.odd = pair.number % 2 != 0;
                List<Pair> list = map.get(pair.mode);

                if (list == null) {
                    list = new ArrayList<Pair>();
                    list.add(pair);
                    map.put(pair.mode, list);
                } else {
                    list.add(pair);
                }
            }

            builder.append(N).append(" ").append(M).append('\n');
            for (Map.Entry<Integer, List<Pair>> entry : map.entrySet()) {
                Collections.sort(entry.getValue(), comparator);
                while (!entry.getValue().isEmpty()) {
                    builder.append(entry.getValue().remove(0).number).append('\n');
                }
            }
            tokenizer = new StringTokenizer(reader.readLine());
            N = Integer.parseInt(tokenizer.nextToken());
            M = Integer.parseInt(tokenizer.nextToken());
        }
        builder.append("0 0");
        System.out.println(builder.toString());
    }
}