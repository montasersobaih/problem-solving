package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RankList {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String[] str1 = b.readLine().split(" ");
        int loop = Integer.parseInt(str1[0]), num = Integer.parseInt(str1[1]), count = 0;
        Team[] arr = new Team[loop];
        for (int i = 0; i < loop; i++) {
            str1 = b.readLine().split(" ");
            arr[i] = new Team(Integer.parseInt(str1[0]), Integer.parseInt(str1[1]));
        }
        Arrays.sort(arr);

        if (!(num > 0 && num <= arr.length)) {
            System.out.println(0);
            return;
        }
        Team t = new Team(arr[arr.length - num].solved, arr[arr.length - num].penallty);
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i].solved == t.solved && arr[i].penallty == t.penallty) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static class Team implements Comparable<Team> {
        protected int solved, penallty;

        Team(int solved, int penallty) {
            this.solved = solved;
            this.penallty = penallty;
        }

        @Override
        public int compareTo(Team team) {
            return (solved > team.solved) ? 1 : (solved != team.solved) ? -1 : (penallty > team.penallty) ? -1 : 1;
        }
    }
}