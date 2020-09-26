package URI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class HashTabelsByLinkedList {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        int loop = Integer.parseInt(b.readLine());
        while (loop > 0) {
            StringTokenizer str = new StringTokenizer(b.readLine());

            int hashcode = Integer.parseInt(str.nextToken());
            int elementnumber = Integer.parseInt(str.nextToken());

            LinkedList<Integer>[] list = new LinkedList[hashcode];

            str = new StringTokenizer(b.readLine());
            for (int i = 0; i < elementnumber; i++) {
                int element = Integer.parseInt(str.nextToken());
                if (list[element % hashcode] != null) {
                    list[element % hashcode].add(element);
                } else {
                    list[element % hashcode] = new LinkedList();
                    list[element % hashcode].add(element);
                }
            }

            for (int i = 0; i < list.length; i++) {
                System.out.print(i + " ->");
                if (list[i] != null) {
                    while (!list[i].isEmpty()) {
                        System.out.printf(" %d ->", list[i].poll());
                    }
                }
                System.out.println(" \\");
            }
            loop--;

            if (loop > 0) {
                System.out.println();
            }
        }
    }
}        