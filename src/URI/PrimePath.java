package URI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;

public class PrimePath {

    private static int N = 9999;
    private static boolean primes[] = getPrimes();

    private static boolean[] getPrimes() {
        boolean primes[] = new boolean[N + 1];

        primes[0] = primes[1] = true;
        for (int p = 2; p * p <= N; p++) {
            if (!primes[p]) {
                for (int i = p * 2; i <= N; i += p) {
                    primes[i] = true;
                }
            }
        }
        return primes;
    }

    private static int BFS(int start, int end) {
        Queue<Integer> queue = new LinkedList<Integer>();
        boolean visited[] = new boolean[N + 1];
        int dist[] = new int[N + 1];

        Arrays.fill(dist, -1);

        dist[start] = 0;
        visited[start] = true;
        queue.offer(start);
        while (!queue.isEmpty()) {
            int prime = queue.poll();

            if (prime == end) {
                return dist[prime];
            }

            int digits[] = {
                    (prime % 10),
                    ((prime / (int) 1e1) % 10) * 10,
                    ((prime / (int) 1e2) % 10) * 100,
                    ((prime / (int) 1e3) % 10) * 1000
            };

            int nums[] = {
                    digits[0] + digits[1] + digits[2],
                    digits[0] + digits[1] + digits[3],
                    digits[0] + digits[2] + digits[3],
                    digits[1] + digits[2] + digits[3],
            };

            for (int i = 0; i < 4; i++) {
                int digit = (int) Math.pow(10, 3 - i);
                for (int j = 0; j <= 9; j++) {
                    int isPrime = nums[i] + j * digit;
                    if (!primes[isPrime] && !visited[isPrime] && isPrime >= 1000) {
                        queue.offer(isPrime);
                        visited[isPrime] = true;
                        dist[isPrime] = dist[prime] + 1;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = parseInt(reader.readLine());
        while (tc-- > 0) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int start = parseInt(tokenizer.nextToken()), end = parseInt(tokenizer.nextToken());

            int result = BFS(start, end);
            writer.write((result != -1) ? valueOf(result) : "Impossible");
            writer.newLine();
        }
        writer.flush();
    }
}