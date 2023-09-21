import java.util.Stack;

public class MiddleElementOfStack {
    private static void mid(Stack<Integer> stack, int n) {
        int mid = (n / 2) + 1;
        deleteMid(stack, mid);
    }

    private static void deleteMid(Stack<Integer> stack, int mid) {
        if (mid == 1) {
            stack.pop();
            return;
        }

        int temp = stack.pop();
        deleteMid(stack, mid - 1);
        stack.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        mid(stack, stack.size());
        System.out.println(stack);
    }
}
