// Recursion approach using merge sort for counting inversions
// Time complexity O(n * logn) -> Master's Theorem
// Auxiliary space O(n)

import java.util.Arrays;

public class inversions {
    private static int mergeAndCount(int arr[], int s, int e) {
        int mid = s + (e - s) / 2;

        int[] first = Arrays.copyOfRange(arr, s, mid + 1);
        int[] second = Arrays.copyOfRange(arr, mid + 1, e + 1);

        int mainArrayIndex = s;
        int i = 0, j = 0, swapCnt = 0;

        while (i < first.length && j < second.length) {
            if (first[i] <= second[j]) {
                arr[mainArrayIndex++] = first[i++];
            } else {
                arr[mainArrayIndex++] = second[j++];
                swapCnt += (mid + 1) - (s + i);
            }
        }
        while (i < first.length) {
            arr[mainArrayIndex++] = first[i++];
        }
        while (j < second.length) {
            arr[mainArrayIndex++] = arr[j++];
        }
        return swapCnt;
    }

    private static int sortAndCount(int arr[], int s, int e) {
        int mid = s + (e - s) / 2;
        int count = 0;
        if (s < e) {
            count += sortAndCount(arr, s, mid);
            count += sortAndCount(arr, mid + 1, e);
            count += mergeAndCount(arr, s, e);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 20, 6, 4, 5 };
        int ans = sortAndCount(arr, 0, arr.length - 1);
        System.out.println("Inversions : " + ans);
    }
}