public class singleNumber {
    private static int single(int nums[]) {
        int ans = 0;

        for (int i : nums) {
            ans ^= i;
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 2, 1, 2 };
        int ans = single(arr);
        System.out.println(ans);
    }
}
