// Monotonic stack is a stack which has elements only in increasing order or decreasing order
// Next greater/ smaller problem 

import java.util.Arrays;
import java.util.Stack;

public class monotonicStack {
    private static int[] Monotonic(int arr[], int n) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (stack.size() > 0 && stack.peek() > arr[i]) {
                // if decreasing stack.pop() < arr[i]
                stack.pop();
            }
            stack.push(arr[i]);
        }
        int size = stack.size();
        int ans[] = new int[size];
        Arrays.fill(ans, 0);

        int j = size - 1;

        while (!stack.isEmpty()) {
            ans[j] = stack.peek();
            stack.pop();
            j--;
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 5, 3, 2, 7, 5, 8, 9 };
        int ans[] = Monotonic(arr, arr.length);
        for (int i : ans) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}