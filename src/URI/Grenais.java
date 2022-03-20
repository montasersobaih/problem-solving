package URI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Grenais {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter f = new BufferedWriter(new OutputStreamWriter(System.out));

        int s = 1, game = 0, Inter = 0, Gremio = 0, equal = 0;
        while (s != 2) {
            if (s == 1) {
                StringTokenizer string = new StringTokenizer(b.readLine());
                int x = string.nextToken().compareTo(string.nextToken());

                game++;
                if (x > 0) {
                    Inter++;
                } else if (x < 0) {
                    Gremio++;
                } else {
                    equal++;
                }
                f.write("Novo grenal (1-sim 2-nao)\n");
            } else {
                f.write("Novo grenal (1-sim 2-nao)\n");
            }
            s = Integer.parseInt(b.readLine());
        }
        f.write(String.format("%d grenais\nInter:%d\nGremio:%d\nEmpates:%d\n%s\n"
                ,
                game,
                Inter,
                Gremio,
                equal,
                (Inter > Gremio) ? "Inter venceu mais" :
                        (Inter == Gremio) ? "Nao houve vencedor" :
                                "Gremio venceu mais"));
        f.flush();
    }
}
