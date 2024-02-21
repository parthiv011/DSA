public class maxSumOfKElements {
    private static int maxSum(int arr[], int n, int k) {
        if (n < k) {
            return -1;
        }
        int max = 0;
        for (int i = 0; i < k; i++) {
            max += arr[i];
        }

        int windowSum = max;
        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k];
            max = Math.max(windowSum, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int k = 3;
        int ans = maxSum(arr, arr.length, k);
        System.out.println(ans);
    }
}
