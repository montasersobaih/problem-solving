package Testing;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class GridAndPaths {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedReader reader = new BufferedReader(new FileReader("Input.txt"));

        int tc = parseInt(reader.readLine());
        while (tc-- > 0) {
            int col = parseInt(reader.readLine());
            String l1 = reader.readLine(), l2 = reader.readLine();

            int blocking = 0;
            for (int i = 0; i < col - 1; i += 2) {
                boolean block = true;
                if (l1.charAt(i) != '.' || l1.charAt(i + 1) != '.' || l2.charAt(i) != '.' || l2.charAt(i + 1) != '.') {
                    block = false;
                    i--;
                }

                if (block) {
                    blocking++;
                }
            }
            System.out.println(blocking);
        }
    }
}