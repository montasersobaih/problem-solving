package URI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class SelectionTest1 {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer string = new StringTokenizer(b.readLine());
        int A = Integer.parseInt(string.nextToken()),
                B = Integer.parseInt(string.nextToken()),
                C = Integer.parseInt(string.nextToken()),
                D = Integer.parseInt(string.nextToken());

        BufferedWriter f = new BufferedWriter(new OutputStreamWriter(System.out));

        if (B > C && D > A && (C + D) > (A + B) && C >= 0 && D >= 0 && A % 2 == 0) {
            f.write("Valores aceitos\n");
        } else {
            f.write("Valores nao aceitos\n");
        }

        f.flush();
        f.close();
        b.close();
    }
}
