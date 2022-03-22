package Testing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class TheNewPresident {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = null;

        int tc = parseInt(reader.readLine());
        while (tc-- > 0) {
            tokenizer = new StringTokenizer(reader.readLine());
            int candi = parseInt(tokenizer.nextToken()), voters = parseInt(tokenizer.nextToken());

            Candidate[] candidates = new Candidate[candi + 1];
            for (int i = 0; i <= candi; i++) {
                candidates[i] = new Candidate(i);
            }

            int[][] votes = new int[voters][candi];
            for (int i = 0; i < voters; i++) {
                tokenizer = new StringTokenizer(reader.readLine());
                for (int j = 0; j < candi; j++) {
                    votes[i][j] = parseInt(tokenizer.nextToken());
                }
            }

            for (int i = 0; i < voters; i++) {
                int sound = votes[i][0];
                candidates[sound].plusplus();
            }

            Arrays.sort(candidates);

            String result = null;
            if (candidates[0].getCount() > (voters / 2)) {
                result = candidates[0].getId() + " " + 1;
            } else {
                int id1 = candidates[0].getId(), id2 = candidates[1].getId(), m1 = 0, m2 = 0;
                for (int i = 0; i < voters; i++) {
                    for (int j = 0; j < candi; j++) {
                        if (votes[i][j] == id1) {
                            m1++;
                            break;
                        } else if (votes[i][j] == id2) {
                            m2++;
                            break;
                        }
                    }
                }
                result = ((m1 > m2) ? id1 : id2) + " " + 2;
            }

            System.out.println(result);
        }
    }

    private static class Candidate implements Comparable<Candidate> {
        private int id, count;

        public Candidate(int id) {
            this.id = id;
            this.count = 0;
        }

        public void plusplus() {
            count++;
        }

        public int getId() {
            return id;
        }

        public int getCount() {
            return count;
        }

        @Override
        public int compareTo(Candidate o) {
            return o.getCount() - this.count;
        }
    }
}
