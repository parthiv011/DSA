public class queueUsingLinkedList {
    private class Node {
        int data;
        Node next;

        Node(int data) {

            this.data = data;
            this.next = null;
        }
    }

    private Node front;
    private Node rear;

    queueUsingLinkedList() {
        this.front = null;
        this.rear = null;
    }

    private boolean isEmpty() {
        return front == null;
    }

    private void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    private int dequeue() {
        if (isEmpty())
            return -1;
        else {
            int data = front.data;
            front = front.next;
            if (front == null)
                rear = null;
            return data;
        }
    }

    private int peek() {
        if (isEmpty())
            return -1;
        else {
            return front.data;
        }
    }

    private void display() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        queueUsingLinkedList q = new queueUsingLinkedList();
        q.enqueue(4);
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(9);
        q.enqueue(11);
        q.display();
        System.out.println("Deleted element : " + q.dequeue());
        System.out.println("Is Empty : " + q.isEmpty());
        System.out.println("Peek element : " + q.peek());
    }
}
