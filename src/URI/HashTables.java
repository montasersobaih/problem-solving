package URI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class HashTables {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(b.readLine());
        while (loop > 0) {
            Hashtable<Integer, LinkedList<Integer>> hash = new Hashtable();
            StringTokenizer str = new StringTokenizer(b.readLine());
            int hashelement = Integer.parseInt(str.nextToken()), a = Integer.parseInt(str.nextToken());
            str = new StringTokenizer(b.readLine());
            while (str.hasMoreTokens()) {
                int token = Integer.parseInt(str.nextToken());
                if (hash.get(token % hashelement) == null) {
                    hash.put(token % hashelement, new LinkedList());
                    hash.get(token % hashelement).offer(token);
                } else {
                    hash.get(token % hashelement).offer(token);
                }
            }
            for (int i = 0; i < hashelement; i++) {
                System.out.print(i + " ->");
                while (hash.get(i) != null && !hash.get(i).isEmpty()) {
                    System.out.printf(" %d ->", hash.get(i).poll());
                }
                System.out.println(" \\");
            }
//            loop--;
            if (--loop > 0) {
                System.out.println();
            }
        }
    }
}