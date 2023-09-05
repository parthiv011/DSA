import java.util.LinkedList;
import java.util.Queue;

public class stackUsingQueue {
    Queue<Integer> queue = new LinkedList<>();

    void push(int element) {
        int s = queue.size();
        queue.add(element);
        for (int i = 0; i < s; i++) {
            queue.add(queue.remove());
        }
    }

    void pop() {
        if (queue.isEmpty()) {
            System.out.println("Stack is Empty !");
            return;
        }
        queue.remove();
    }

    int top() {
        if (queue.isEmpty()) {
            return -1;
        }
        return queue.peek();
    }

    int size() {
        return queue.size();
    }

    void display() {
        System.out.println(queue);
    }

    public static void main(String[] args) {
        stackUsingQueue stack = new stackUsingQueue();
        stack.push(7);
        stack.push(21);
        stack.push(11);
        stack.display();
        System.out.println("current size : " + stack.size());
        stack.pop();
        stack.display();
        System.out.println("Peek element : " + stack.top());
        System.out.println("current size : " + stack.size());
    }
}
