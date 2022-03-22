package Testing;

import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class CapitalCity {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int loop = parseInt(reader.readLine());
        while (loop-- > 0) {
            String[] split = reader.readLine().split(" ");
            List[] list = new List[parseInt(split[0])];
            int end = parseInt(split[1]), max = 0, start = 0;
            while (end-- > 0) {
                split = reader.readLine().split(" ");
                int v1 = parseInt(split[0]) - 1, v2 = parseInt(split[1]) - 1, weight = parseInt(split[2]);
                if (list[v1] != null) {
                    list[v1].add(new Point(v2, weight));
                } else {
                    list[v1] = new LinkedList<Point>();
                    list[v1].add(new Point(v2, weight));
                }

                if (list[v1].size() > max) {
                    max = list[v1].size();
                    start = v1;
                }
            }
            System.out.printf("%d %d\n", start + 1, BFS(list, start, list.length));
        }
    }

    private static int BFS(List<Point>[] list, int start, int vertices) {

        return 0;
    }
}
/*
1
7 7
1 2 5
1 7 5
3 2 5
1 3 5
3 4 3
6 4 1
4 5 3
*/
