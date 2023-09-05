import java.util.Stack;

public class queueUsingStacks {
    Stack<Integer> stack = new Stack<>();

    private void push(int element) {
        int s = stack.size();
        for (int i = s; i > 0; i--) {
            stack.add(i, stack.remove(i));
        }
    }

    private int pop() {
        if (stack.isEmpty())
            return -1;
        return stack.pop();
    }

    private int peek() {
        if (stack.isEmpty()) {
            System.out.println("Stack is Empty! ");
            return -1;
        }
        return stack.peek();
    }

    private boolean Empty() {
        if (stack.isEmpty())
            return true;
        return false;
    }

    public static void main(String[] args) {
        queueUsingStacks queue = new queueUsingStacks();
        queue.push(1);
        queue.push(1);
        queue.push(2);
        System.out.println(queue.pop());
    }
}