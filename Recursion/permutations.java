import java.util.ArrayList;
import java.util.List;

public class permutations {
    private static void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void solve(int[] nums, List<List<Integer>> ans, int index) {
        // base case
        if (index >= nums.length) {
            List<Integer> result = new ArrayList<Integer>();
            for (int i = 0; i < nums.length; i++) {
                result.add(nums[i]);
            }
            ans.add(result);
            return;
        }
        for (int j = index; j < nums.length; j++) {
            swap(nums, index, j);
            solve(nums, ans, index + 1);
            // backtrack to original index
            // this will only differ in format of the answer
            swap(nums, index, j);
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int index = 0;
        solve(nums, ans, index);
        return ans;
    }

    public static void main(String[] args) {
        int nums[]={1,2,3};
        System.out.println("Permutation: " + permute(nums));
    }
}
