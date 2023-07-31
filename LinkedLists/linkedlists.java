public class linkedlists {
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private static Node insertAtHead(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    private static Node insertAtTail(Node tail, int data) {
        Node temp = new Node(data);
        tail.next = temp;
        tail = tail.next;
        return tail;
    }

    private static Node insertAtMiddle(Node head, Node tail, int position, int data) {
        if (position == 1) {
            return insertAtHead(head, data);
        }

        Node temp = head;
        int cnt = 1;

        while (cnt < position - 1) {
            temp = temp.next;
            cnt++;
        }
        Node NodeToInsert = new Node(data);
        NodeToInsert.next = temp.next;
        temp.next = NodeToInsert;
        if (temp == tail) {
            tail = NodeToInsert;
        }
        return head;
    }

    private static void print(Node head) {

        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Node n = new Node(4);
        Node head = n;
        Node tail = n;
        print(head);

        head = insertAtHead(head, 10);
        print(head);

        tail = insertAtTail(tail, 0);
        print(head);

        Node p = insertAtMiddle(head, tail, 1, 3);
        print(head);
    }
}