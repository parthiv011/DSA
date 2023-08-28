// import java.util.LinkedList;
// import java.util.Queue;

public class queue {
    int arr[];
    int front;
    int rear;

    queue(int size) {
        arr = new int[size];
        front = 0;
        rear = 0;
    }

    private void enqueue(int data) {
        if (rear == arr.length) {
            System.out.println("Queue is full");
        } else {
            arr[rear] = data;
            rear++;
        }
    }

    private int dequeue() {
        if (isEmpty()) {
            return -1;
        } else {
            int ans = arr[front];
            arr[front] = -1;
            front++;
            return ans;
        }
    }

    private int peek() {
        if (isEmpty())
            return -1;
        else {
            return arr[front];
        }
    }

    private boolean isEmpty() {
        return front == rear;
    }

    private void display() {
        for (int i = front; i < rear; ++i) {
            System.out.print(arr[i] + " -> ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // implementing using arrays
        queue q = new queue(5);
        q.enqueue(5);
        q.enqueue(2);
        q.enqueue(4);
        q.display();
        System.out.println("Is empty : " + q.isEmpty());
        System.out.println("Peek element : " + q.peek());
        System.out.println("Deleted element : " + q.dequeue());
        System.out.println("Peek element : " + q.peek());

        // implementing using Collections
        // Queue<Integer> q = new LinkedList<>();
        // q.add(11);
        // q.add(12);
        // q.add(13);
        // q.add(14);
        // System.out.println(q);
        // q.remove();
        // System.out.println(q);
        // System.out.println("Is empty : " + q.isEmpty());
        // System.out.println("Size : " + q.size());
        // System.out.println("Peek element : " + q.peek());
    }
}