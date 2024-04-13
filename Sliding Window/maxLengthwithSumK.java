public class maxLengthwithSumK {
    private static int findMaxLenght(int arr[], int k) {
        int maxLen = 0;
        int l = 0, r = 0;
        int sum = 0;
        int n = arr.length;
        while (r < n) {
            sum += arr[r];
            // shrink from left side
            while (sum > k) {
                sum -= arr[l];
                l++;
            }
            if (sum <= k) {
                maxLen = Math.max(maxLen, r - l + 1);
            }
            r++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 1, 10, 10 };
        int k = 14;
        int ans = findMaxLenght(arr, k);
        System.out.println(ans);
    }
}
