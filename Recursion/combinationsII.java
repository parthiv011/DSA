import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationsII {
    private void findCombinations(int index, int target, int arr[], List<List<Integer>> ans, List<Integer> output) {
        if (target == 0) {
            ans.add(new ArrayList<>(output));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            if (i > index && arr[i] == arr[i - 1]) {
                continue;
            }

            if (arr[i] <= target) {
                output.add(arr[i]);
                findCombinations(i + 1, target - arr[i], arr, ans, output);
                output.remove(output.size() - 1);
            }
        }
    }

    public List<List<Integer>> combII(int arr[], int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        findCombinations(0, target, arr, ans, new ArrayList<>());
        return ans;
    }

    public static void main(String[] args) {
        combinationsII c1 = new combinationsII();
        int arr[] = { 10, 1, 2, 7, 6, 1, 5 };
        int target = 8;
        System.out.println("All possible combinations are: " + c1.combII(arr, target));
    }
}
