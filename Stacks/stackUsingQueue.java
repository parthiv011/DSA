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
        stackUsingQueue s = new stackUsingQueue();
        s.push(7);
        s.push(21);
        s.push(11);
        s.display();
        System.out.println("current size : " + s.size());
        s.pop();
        s.display();
        System.out.println("Peek element : " + s.top());
        System.out.println("current size : " + s.size());
    }
}
