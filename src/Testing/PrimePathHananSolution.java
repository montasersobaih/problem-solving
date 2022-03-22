package Testing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class PrimePathHananSolution {

    private static boolean[] isPrime;

    private static void primes() {
        int num = 10000;
        isPrime = new boolean[num + 1];
        isPrime[0] = isPrime[1] = true;
        for (int i = 2; i * i <= num; ++i) {
            if (!isPrime[i]) {
                for (int j = i * i; j <= num; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = parseInt(reader.readLine());
        StringTokenizer tok;

        for (int i = 0; i < t; i++) {
            tok = new StringTokenizer(reader.readLine());
            int x = parseInt(tok.nextToken());
            int y = parseInt(tok.nextToken());
            writer.write(cost(x, y) + "");
            writer.newLine();
        }
        writer.flush();
    }

    public static int cost(int n1, int n2) {
        boolean[] visited = new boolean[10000];
        Queue<State> q = new LinkedList<State>();
        q.add(new State(n1, 0));
        while (!q.isEmpty()) {
            State s = q.poll();
            if (s.n == n2) {
                return s.cost;
            }

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 4; j++) {
                    if (i == 0 && j == 0 || j == 3 && i % 2 == 0) {
                        continue;
                    } else {
                        int n = newNumber(s.n, j, i);
                        if (!isPrime[n] && !visited[n]) {
                            visited[n] = true;
                            q.add(new State(n, s.cost + 1));
                        }
                    }
                }
            }
        }
        return 0;
    }

    public static int newNumber(int n, int i, int r) {
        int p = (int) pow(10, 3 - i);
        r -= (n / p) % 10;
        n += r * p;
        return n;
    }

    public static class State {

        int n;
        int cost;

        public State(int n, int cost) {
            this.n = n;
            this.cost = cost;
        }
    }
}
