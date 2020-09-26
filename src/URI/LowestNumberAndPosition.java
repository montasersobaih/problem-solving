package URI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LowestNumberAndPosition {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(b.readLine()), min = Integer.MAX_VALUE, value = 0, index = 0;
        StringTokenizer token = new StringTokenizer(b.readLine());
        for (int i = 0; i < loop; i++) {
            if ((value = Integer.parseInt(token.nextToken())) < min) {
                min = value;
                index = i;
            }
        }
        System.out.format("Menor valor: %d\nPosicao: %d\n", min, index);
    }
}