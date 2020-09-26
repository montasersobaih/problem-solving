package URI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SortByLingth {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in)/*new FileReader("Input")*/);

        int loop = Integer.parseInt(b.readLine());
        while (loop-- > 0) {
            StringTokenizer str = new StringTokenizer(b.readLine());
            String[] x = new String[str.countTokens()];

            for (int i = 0; i < x.length; i++) {
                x[i] = str.nextToken();
            }

            for (int i = 0; i < x.length; i++) {
                for (int j = i + 1; j < x.length; j++) {
                    if (x[j].length() > x[i].length()) {
                        String s = x[j];
                        for (int k = j; k > i; k--) {
                            x[k] = x[k - 1];
                        }
                        x[i] = s;
                    }
                }
            }
            String s = "";
            for (int i = 0; i < x.length; i++) {
                s += (x[i] + " ");
            }
            System.out.println(s.trim());
        }
    }
}