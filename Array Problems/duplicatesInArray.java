import java.util.ArrayList;
import java.util.List;

public class duplicatesInArray {
    private static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static List<Integer> duplicates(int nums[]) {
        List<Integer> ans = new ArrayList<>();

        int i = 0;
        while (i < nums.length) {
            int curr = nums[i] - 1;
            if (nums[i] != nums[curr]) {
                swap(nums, i, curr);
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                ans.add(nums[j]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 7, 8, 2, 3, 1 };
        List<Integer> ans = duplicates(arr);
        System.err.println(ans);
    }
}
