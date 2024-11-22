package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CircleLineByNode {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int station = Integer.parseInt(b.readLine()), i = 0;
        StringTokenizer token = new StringTokenizer(b.readLine());
        Node[] n = new Node[station];
        n[0] = new Node(Integer.parseInt(token.nextToken()));
        while (token.hasMoreTokens()) {
            n[i++].next = (n[i] = new Node(Integer.parseInt(token.nextToken())));
        }
        n[i].next = n[0];
        token = new StringTokenizer(b.readLine());
        int from = Integer.parseInt(token.nextToken()), to = Integer.parseInt(token.nextToken()), sum1 = 0, sum2 = 0;
        Node ptr2 = n[from - 1], ptr3 = n[to - 1], ptr4 = ptr2, ptr5 = ptr3;
        while (ptr2 != ptr5 || ptr3 != ptr4) {
            if (ptr2 != ptr5) {
                sum1 += ptr2.value;
                ptr2 = ptr2.next;
            }

            if (ptr3 != ptr4) {
                sum2 += ptr3.value;
                ptr3 = ptr3.next;
            }
        }
        System.out.println(Math.min(sum1, sum2));
    }

    private static class Node {
        protected int value;
        protected Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}