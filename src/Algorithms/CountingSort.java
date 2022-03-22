package Algorithms;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
//        int[] ar = {1, 4, 1, 2, 7, 5, 2};
        int[] ar = {145, 400, 123, 267, 734, 521, 276};
        countingSort(ar, 734);
        System.out.println(Arrays.toString(ar));
    }

    private static void countingSort(int ar[], int maxNum) {
        int[] output = new int[ar.length], count = new int[maxNum + 1];

        for (int i = 0; i < ar.length; i++) {
            count[ar[i]]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int i = 0; i < ar.length; i++) {
            count[ar[i]]--;
            output[count[ar[i]]] = ar[i];
        }

        for (int i = 0; i < ar.length; i++) {
            ar[i] = output[i];
        }
    }
}
