public class climbingstairs {
    public int climbStairs(int n) {
        if (n < 0)
            return 0;

        int dp[] = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        climbingstairs obj = new climbingstairs();
        System.out.println(obj.climbStairs(13));
    }
}
