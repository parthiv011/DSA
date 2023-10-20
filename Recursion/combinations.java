import java.util.ArrayList;
import java.util.List;

public class combinations {
    private void findCombinations(int index, int arr[], int target, List<List<Integer>> ans, List<Integer> output) {
        if (index == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(output));
            }
            return;
        }

        // pick up the element
        if (arr[index] <= target) {
            output.add(arr[index]);
            findCombinations(index, arr, target - arr[index], ans, output);
            output.remove(output.size() - 1);
        }

        // dont pick the element
        findCombinations(index + 1, arr, target, ans, output);
    }

    public List<List<Integer>> comb(int arr[], int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0, arr, target, ans, new ArrayList<>());
        return ans;
    }

    public static void main(String[] args) {
        combinations c1 = new combinations();
        int arr[] = { 2, 3, 7 };
        int target = 10;
        System.out.println("Combinations: " + c1.comb(arr, target));
    }
}
