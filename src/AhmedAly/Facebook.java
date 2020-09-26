package AhmedAly;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Facebook {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(b.readLine());
        for (int i = 1; i <= loop; i++) {
            String[] x = b.readLine().split(" ");
            int loop2 = Integer.parseInt(x[0]), wanted = Integer.parseInt(x[1]);
            HashMap<String, Integer> map = new HashMap<String, Integer>();
            while (loop2-- > 0) {
                x = b.readLine().replace("'s", "").split(" ");
                if (x[0].equals("liked")) {
                    map.put(x[1], (map.get(x[1]) != null) ? map.get(x[1]) + 1 : 1);
                } else {
                    map.put(x[2], (map.get(x[2]) != null) ? map.get(x[2]) + 1 : 1);
                }
            }
            int in = 0, out = 0;
            People[] s = new People[map.size()];
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                s[in++] = new People(entry.getKey(), entry.getValue());
            }
            Arrays.sort(s);
            System.out.format("Case %d:\n", i);
            while (wanted-- > 0) {
                System.out.println(s[out++].name);
            }
            map.clear();
        }
    }

    private static class People implements Comparable<People> {
        protected String name;
        protected int value;

        public People(String name, int value) {
            this.name = name;
            this.value = value;
        }

        @Override
        public int compareTo(People o) {
            return (this.value < o.value) ? 1 : (this.value == o.value) ? 0 : -1;
        }
    }
}