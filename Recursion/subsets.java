//print all possible subsets of an array
// we can solve this using inclusion and exclusion concept in recursion

import java.util.Vector;

class subsets {
    private static void solve(Vector<Integer> nums, Vector<Integer> output, int index, Vector<Vector<Integer>> ans) {
        // base case
        if (index >= nums.size()) {
            ans.add(output);
            return;
        }
        // exclude
        solve(nums, new Vector<>(output), index + 1, ans);

        // include
        output.add(nums.get(index));
        solve(nums, new Vector<>(output), index + 1, ans);
    }

    public static void main(String[] args) {
        Vector<Vector<Integer>> ans = new Vector<>();
        Vector<Integer> input = new Vector<>();
        input.add(1);
        input.add(2);
        input.add(3);
        solve(input, new Vector<Integer>(), 0, ans);
        System.out.println(ans);
    }
}