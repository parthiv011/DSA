public class doublyLinkedLists {
    private static Node head;
    private static Node tail;

    private class Node {
        Node prev;
        int data;
        Node next;

        Node(int data) {
            this.prev = null;
            this.data = data;
            this.next = null;
        }
    }

    private void insertAtHead(int data) {
        if (tail == null) {
            tail = head;
        }
        Node newNode = new Node(data);
        newNode.prev = null;
        newNode.next = head;
        head = newNode;
    }

    private void insertAtTail(int data) {
        if (tail == null) {
            insertAtHead(data);
            return;
        }
        Node temp = new Node(data);
        tail.next = temp;
        temp.prev = tail;
        tail = temp;
    }

    private void insertAtPosition(int position, int data) {
        if (position == 0) {
            insertAtHead(data);
            return;
        }
        int cnt = 0;
        Node newNode = head;
        while (cnt < position - 1) {
            newNode = newNode.next;
            ++cnt;
        }
        if (newNode.next == null) {
            insertAtTail(data);
            return;
        }
    }

    private void deleteNode(int position) {
    }

    private void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        doublyLinkedLists dlist = new doublyLinkedLists();
        dlist.insertAtHead(4);
        dlist.insertAtHead(3);
        dlist.insertAtHead(1);
        dlist.insertAtTail(5);
        dlist.insertAtPosition(1, 2);
        dlist.print(head);
    }
}