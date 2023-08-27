import java.util.Stack;

public class stacks {
    // Stack using Arrays
    // time complexity of all functions is O(1)
    public static class stack {
        int arr[];
        int top;
        int size;

        stack(int size) {
            this.size = size;
            this.top = -1;
            arr = new int[size];
        }

        void push(int element) {
            if (size - top > 1) {
                top++;
                arr[top] = element;
                System.out.println("Element pushed : " + element);
            } else {
                System.out.println("Stack OverFlow!");
            }
        }

        void pop() {
            if (top >= 0) {
                top--;
                System.out.println("Element deleted");
            } else {
                System.out.println("Stack Underflow!");
            }
        }

        int peek() {
            if (top >= 0) {
                return arr[top];
            } else {
                System.out.println("Stack is empty ");
                return -1;
            }
        }

        boolean isEmpty() {
            if (top == -1) {
                return true;
            } else {
                return false;
            }
        }

    }

    public static void main(String[] args) {

        stack s = new stack(4);
        s.push(2);
        s.push(13);
        s.push(21);
        s.push(10);
        s.push(10);
        s.pop();
        // s.pop();
        // s.pop();
        s.pop();
        s.pop();
        System.out.println(s.peek());

        s.isEmpty();
        // Implementing stack using Collections
        // Stack<Integer> test = new Stack<>();
        // System.out.println(test.push(2));
        // System.out.println(test.push(3));
        // System.out.println(test.push(5));
        // System.out.println("Delete element : " + test.pop());
        // System.out.println("Top element : " + test.peek());
        // System.out.println(test.empty());
        // System.out.println("Size of stack is : " + test.size());
    }
}