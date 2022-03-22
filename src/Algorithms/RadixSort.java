package Algorithms;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int ar[] = {170, 45, 75, 90, 802, 24, 2, 66};
        radixSort(ar, 802);

        System.out.println(Arrays.toString(ar));
    }

    private static void radixSort(int ar[], int maxNum) {
        for (int exp = 1; maxNum / exp > 0; exp *= 10) {
            countSort(ar, exp);
        }
    }

    private static void countSort(int ar[], int exp) {
        int output[] = new int[ar.length];
        int count[] = new int[10];

        for (int i = 0; i < ar.length; i++) {
            count[(ar[i] / exp) % 10]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int i = ar.length - 1; i >= 0; i--) {
            count[(ar[i] / exp) % 10]--;
            output[count[(ar[i] / exp) % 10]] = ar[i];
        }

        for (int i = 0; i < ar.length; i++) {
            ar[i] = output[i];
        }
    }
}
