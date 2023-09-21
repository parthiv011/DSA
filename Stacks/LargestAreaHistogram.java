import java.util.Stack;

public class LargestAreaHistogram {
    private static int[] prevSmallerElement(int arr[], int n) {
        int ans[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        for (int i = 0; i < n; i++) {
            int curr = arr[i];
            while (stack.peek() != -1 && arr[stack.peek()] >= curr) {
                stack.pop();
            }
            ans[i] = stack.peek();
            stack.push(i);
        }
        return ans;
    }

    private static int[] nextSmallerElement(int arr[], int n) {
        int ans[] = new int[n];
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        for (int i = n - 1; i >= 0; i--) {
            int curr = arr[i];
            while (stack.peek() != -1 && arr[stack.peek()] >= curr) {
                stack.pop();
            }

            ans[i] = stack.peek();
            stack.push(i);
        }
        return ans;
    }

    private static int LargestArea(int heights[]) {
        int maxArea = 0;
        int n = heights.length;

        int prevIndex[] = prevSmallerElement(heights, n);
        int nextIndex[] = nextSmallerElement(heights, n);

        for (int i = 0; i < heights.length; i++) {
            int l = heights[i];
            if (nextIndex[i] == -1)
                nextIndex[i] = n;
            int b = nextIndex[i] - prevIndex[i] - 1;

            int newArea = l * b;
            maxArea = Math.max(newArea, maxArea);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 2, 3 };
        int area = LargestArea(arr);
        System.out.println(area);
    }
}