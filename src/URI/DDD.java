package URI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DDD {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter f = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] x = {11, 19, 21, 27, 31, 32, 61, 71};
        String[] s = {"Sao Paulo", "Campinas", "Rio de Janeiro", "Vitoria",
                "Belo Horizonte", "Juiz de Fora", "Brasilia", "Salvador"};

        int y = BS(x, 0, x.length - 1, (x.length - 1) / 2, Integer.parseInt(b.readLine()));
        f.write((y != -1) ? s[y] : "DDD nao cadastrado");
        f.newLine();
        f.flush();
        f.close();
        b.close();
    }

    public static int BS(int[] x, int start, int end, int mid, int num) {
        while (start <= end) {
            if (x[mid] == num) {
                return mid;
            } else if (x[mid] > num) {
                return BS(x, start, mid - 1, (start + (mid - 1)) / 2, num);
            } else {
                return BS(x, mid + 1, end, ((mid + 1) + end) / 2, num);
            }
        }
        return -1;
    }
}