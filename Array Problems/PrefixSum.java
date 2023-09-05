public class PrefixSum {
    private static int[] prefixSum(int nums[]) {
        int ans[] = new int[nums.length];
        ans[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ans[i] = ans[i - 1] + nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { -1, 0, 3, -2, 4, 6 };
        int ans[] = prefixSum(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
}
