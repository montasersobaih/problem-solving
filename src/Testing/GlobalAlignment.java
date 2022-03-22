package Testing;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class GlobalAlignment {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Insert Sequence 1: ");
        char[] seq1 = s.next().toCharArray();
        System.out.print("Insert Sequence 2: ");
        char[] seq2 = s.next().toCharArray();

        System.out.print("Insert Gap: ");
        int gap = s.nextInt();
        System.out.print("Insert Match: ");
        int match = s.nextInt();
        System.out.print("Insert Mismatch: ");
        int mismatch = s.nextInt();

        //======================Score Matrix=====================
        int height = seq2.length + 1, width = seq1.length + 1;
        int[][] scoreMatrix = new int[height][width];

        for (int i = 1; i < height; i++) {
            scoreMatrix[i][0] = scoreMatrix[i - 1][0] + gap;
        }

        for (int j = 1; j < width; j++) {
            scoreMatrix[0][j] = scoreMatrix[0][j - 1] + gap;
        }

        for (int i = 1; i < height; i++) {
            for (int j = 1; j < width; j++) {
                int scoreDiagonal = scoreMatrix[i - 1][j - 1] + (seq2[i - 1] == seq1[j - 1] ? match : mismatch);
                int scoreLeft = scoreMatrix[i][j - 1] + gap;
                int scoreUp = scoreMatrix[i - 1][j] + gap;
                scoreMatrix[i][j] = Math.max(Math.max(scoreDiagonal, scoreLeft), scoreUp);
            }
        }

        System.out.println("\n\n-----Scoring Matrix-----");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(scoreMatrix[i][j] + "\t");
            }
            System.out.println();
        }
        //=========================================================

        //========================Trace Back With Alignment=======================
        for (int i = 0; i < (seq2.length + 1); i++) {
            scoreMatrix[i][0] = 0;
        }

        for (int j = 0; j < (seq1.length + 1); j++) {
            scoreMatrix[0][j] = 0;
        }

        Queue<String> traceBack = new ArrayDeque<String>();
        Queue<Stack<String>> alignment = new ArrayDeque<Stack<String>>();

        Queue<Path> points = new ArrayDeque<Path>();
        points.offer(new Path(height - 1, width - 1, new Stack<String>(), ""));
        while (!points.isEmpty()) {
            Path p = points.poll();
            int i = p.i;
            int j = p.j;
            String traceBack1 = p.traceBack;
            Stack<String> alignment1 = p.alignment;

            if (i > 0 && j > 0) {
                if (scoreMatrix[i][j] - gap == scoreMatrix[i - 1][j]) {
                    Stack<String> n = new Stack<String>();
                    n.addAll(p.alignment);
                    n.push('-' + "" + seq2[i - 1]);
                    points.offer(new Path(i - 1, j, n, scoreMatrix[i][j] + " " + traceBack1));
                }

                if ((scoreMatrix[i][j] - match) == scoreMatrix[i - 1][j - 1] || (scoreMatrix[i][j] - mismatch) == scoreMatrix[i - 1][j - 1]) {
                    Stack<String> n = new Stack<String>();
                    n.addAll(p.alignment);
                    n.push(seq2[i - 1] + "" + seq1[j - 1]);
                    points.offer(new Path(i - 1, j - 1, n, scoreMatrix[i][j] + " " + traceBack1));
                }

                if (scoreMatrix[i][j] - gap == scoreMatrix[i][j - 1]) {
                    Stack<String> n = new Stack<String>();
                    n.addAll(p.alignment);
                    n.push('-' + "" + seq1[j - 1]);
                    points.offer(new Path(i, j - 1, n, scoreMatrix[i][j] + " " + traceBack1));
                }
            } else {
                traceBack.offer(traceBack1);
                alignment.offer(alignment1);
            }
        }

        System.out.println("\n--------Trace Back-------");
        int set1 = 1;
        while (!traceBack.isEmpty()) {
            System.out.printf("Set%d = {%s}\n", set1, traceBack.poll().trim());
        }


        System.out.println("\n--------Alignment-------");
        int set = 1;
        while (!alignment.isEmpty()) {
            Stack<String> ss = alignment.poll();

            System.out.printf("Set%d = {", set);
            int count = 0, length = ss.size();
            while (!ss.isEmpty()) {
                String str = ss.pop();
                if (str.contains("-")) {
                    count++;
                }
                System.out.print(str + " ");
            }
            System.out.println("}, and the longest common sequence is = " + (length - count));
            set++;
        }
    }

    private static class Path {
        private int i, j;
        private String traceBack;
        private Stack<String> alignment;

        public Path(int i, int j, Stack<String> alignment, String traceBack) {
            this.i = i;
            this.j = j;
            this.alignment = alignment;
            this.traceBack = traceBack;
        }
    }
}
