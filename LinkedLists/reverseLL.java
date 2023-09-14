public class reverseLL {
    private static Node head;

    private class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private void insertAtHead(int data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }

    // iterative approach
    private Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node nextNode = null;
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

    private void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        reverseLL obj = new reverseLL();
        obj.insertAtHead(12);
        obj.insertAtHead(15);
        obj.insertAtHead(2);
        obj.insertAtHead(1);
        obj.display(head);
        head = obj.reverse(head);
        obj.display(head);
    }
}
