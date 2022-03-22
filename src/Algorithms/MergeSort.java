package Algorithms;

import java.util.Arrays;

public class MergeSort {
    public static void main(String args[]) {
        int ar[] = {99, 6, 86, 15, 58, 35, 86, 4, 0};
        mergeSort(ar, 0, ar.length - 1);

        System.out.println(Arrays.toString(ar));
    }

    private static void mergeSort(int ar[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(ar, low, mid);
            mergeSort(ar, mid + 1, high);
            merge(ar, low, mid + 1, high);
        }
    }

    private static void merge(int ar[], int low, int mid, int high) {
        int helper[] = new int[ar.length];

        for (int i = low; i <= high; i++) {
            helper[i] = ar[i];
        }

        int i = low, j = mid, k = low;
        while (i < mid && j <= high) {
            if (helper[i] <= helper[j]) {
                ar[k] = helper[i];
                i++;
            } else {
                ar[k] = helper[j];
                j++;
            }
            k++;
        }

        while (i < mid) {
            ar[k] = helper[i];
            k++;
            i++;
        }

        while (j <= high) {
            ar[k] = helper[j];
            k++;
            j++;
        }
    }
}