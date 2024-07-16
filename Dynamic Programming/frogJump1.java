public class frogJump1 {
    public static int[] dp;

    // 1. Recursive approach
    // private static int jump(int arr[], int n) {
    // if (n == 0)
    // return 0;
    // int left = Integer.MAX_VALUE;
    // int right = Integer.MAX_VALUE;

    // if (n >= 1) {
    // left = jump(arr, n - 1) + Math.abs(arr[n] - arr[n - 1]);
    // }

    // if (n >= 2) {
    // right = jump(arr, n - 2) + Math.abs(arr[n] - arr[n - 2]);
    // }

    // return Math.min(left, right);
    // }

    // 2. Memoization Approach
    // public static int jump(int arr[], int n) {
    // dp = new int[n + 1];

    // dp[0] = 0;
    // dp[1] = Math.abs(arr[0] - arr[1]);

    // for (int i = 2; i <= n; i++) {
    // dp[i] = Math.min(dp[i - 1] + Math.abs(arr[i] -
    // arr[i - 1]), dp[i - 2] + Math.abs(arr[i] - arr[i - 2]));
    // }
    // return dp[n];
    // }

    // 3. Tabulation Approach
    public static int jump(int arr[], int n) {
        dp = new int[n];

        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            int fs = dp[i - 1] + Math.abs(arr[i] - arr[i - 1]);
            int ss = Integer.MAX_VALUE;
            if (i > 1)
                ss = dp[i - 2] + Math.abs(arr[i] - arr[i - 2]);

            dp[i] = Math.min(fs, ss);
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 10 };
        int n = arr.length;
        System.out.println(jump(arr, n - 1));
    }
}
