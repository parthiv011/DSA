public class fibonacciMemoization{
    private int dp[];

    public memoizeArray(int n){
        dp = new int[n+1];
        for(int i = 0; i <= n; i++){
            dp[i] = -1;
        }
    }

    private static int fibonacci(int n){
        if(n <= 1){
            return n;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        dp[n] = fibonacci(n - 1) + fibonacci(n - 2);
        return dp[n];
    }
    public static void main(String[] args){
        int n = 10;
        memoizeArray fib = new memoizeArray(n);
        System.out.println(fib.fibonacci(n));
    }
}