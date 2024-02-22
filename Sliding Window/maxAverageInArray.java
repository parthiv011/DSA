public class maxAverageInArray {
    private static double maxAvg(int nums[], int k) {
        double sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double maxAverage = sum / k;

        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            maxAverage = Math.max(maxAverage, sum / k);
        }
        return maxAverage;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 12, -5, -6, 50, 3 };
        int k = 4;

        double ans = maxAvg(nums, k);
        System.out.println(ans);
    }
}
