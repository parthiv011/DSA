public class missingNumInArray {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int currSum = n * (n + 1) / 2;
        int arrSum = 0;
        for (int i = 0; i < nums.length; i++) {
            arrSum += nums[i];
        }
        return currSum - arrSum;
    }

    public static void main(String[] args) {
        int arr[] = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        int ans = missingNumber(arr);
        System.out.println(ans);
    }
}