public class stackUsingLinkedLists {
    private class Node {
        int data;
        Node next;
    }

    private Node top;

    stackUsingLinkedLists() {
        this.top = null;
    }

    private void push(int element) {
        Node temp = new Node();
        if (temp == null) {
            System.out.println("Stack is full");
            return;
        } else {
            temp.data = element;
            temp.next = top;
            top = temp;
        }
    }

    private void pop() {
        if (top != null) {
            Node temp = new Node();
            temp = top;
            top = top.next;
            temp = null;
        } else {
            System.out.println("Stack is empty");
        }
    }

    private void peek() {
        if (top != null) {
            System.out.println("Top Element : " + top.data);
        } else {
            System.out.println("Stack is empty!");
        }
    }

    private boolean isEmpty() {
        if (top == null)
            return true;
        return false;
    }

    public static void main(String[] args) {
        stackUsingLinkedLists stack = new stackUsingLinkedLists();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.peek();
        stack.isEmpty();
    }
}