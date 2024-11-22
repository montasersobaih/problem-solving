package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962-786258874
 * @link <a href="https://codeforces.com/gym/100155/problem/A">A. The New President</a>
 * @algorithm OOP / Arrays
 * @since 09-11-2022
 */

public class TheNewPresident {

    public static void main(String[] args) throws Exception {
        Reader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        int tc = Integer.parseInt(reader.readLine());

        StringTokenizer tokenizer;
        while (tc-- > 0) {
            tokenizer = new StringTokenizer(reader.readLine());
            int cNumber = Integer.parseInt(tokenizer.nextToken());
            int vNumber = Integer.parseInt(tokenizer.nextToken());

            Candidate[] candidates = new Candidate[cNumber];
            for (int i = 0; i < cNumber; i++) {
                candidates[i] = new Candidate(i, 0);
            }

            int[][] votes = new int[vNumber][cNumber];
            for (int i = 0; i < vNumber; i++) {
                tokenizer = new StringTokenizer(reader.readLine());
                for (int j = 0; j < cNumber; j++) {
                    votes[i][j] = Integer.parseInt(tokenizer.nextToken()) - 1;
                }
            }

            int[] result = candidateElection(cNumber, candidates, votes);
            System.out.printf("%d %d\n", result[0] + 1, result[1]);
        }
    }

    private static int[] candidateElection(int cNumber, Candidate[] candidates, int[][] votes) {
        for (int[] vote : votes) {
            for (int j = 0; j < vote.length; j++) {
                candidates[vote[j]].points += (cNumber - j);
            }
        }

        if (cNumber == 1) {
            return new int[]{1, 1};
        } else if (cNumber == 2) {
            if (candidates[0].points > candidates[1].points) {
                return new int[]{candidates[0].id, 1};
            } else {
                return new int[]{candidates[1].id, 1};
            }
        }

        Arrays.sort(candidates);

        candidates = Arrays.copyOfRange(candidates, 0, 2);
        for (int[] vote : votes) {
            for (int j = 0; j < vote.length; j++) {
                for (int k = 0; k < 2; k++) {
                    if (vote[j] == candidates[k].id) {
                        candidates[k].points += (cNumber - j);
                    }
                }
            }
        }

        Arrays.sort(candidates);

        return new int[]{candidates[0].id, 2};
    }

    private static class Candidate implements Comparable<Candidate> {

        private int id, points;

        private Candidate(int id, int points) {
            this.id = id;
            this.points = points;
        }

        @Override
        public int compareTo(Candidate o) {
            return o.points - this.points;
        }
    }
}