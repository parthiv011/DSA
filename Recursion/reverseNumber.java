public class reverseNumber {
    private static int reverse(int num, int sum) {
        if (num == 0)
            return sum;
        int rem = num % 10;
        sum = sum * 10 + rem;
        return reverse(num / 10, sum);
    }

    public static void main(String[] args) {
        int n = 123;
        int ans = reverse(n, 0);
        System.out.println(ans);
    }
}
