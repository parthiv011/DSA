public class circularLL {
    private static Node head;
    private static Node tail;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = newNode;
            head = newNode;
        } else {
            newNode.next = head;
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            head = newNode;
        }
    }

    private void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = newNode;
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    private void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            if (temp == head) { // Only one node in the list
                head = null;
            } else {
                temp.next = head.next;
                head = head.next;
            }
        }
    }

    private void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
        } else {
            Node temp = head;
            Node prev = null;
            while (temp.next != head) {
                prev = temp;
                temp = temp.next;
            }
            if (temp == head) { // Only one node in the list
                head = null;
            } else {
                prev.next = head;
            }
        }
    }

    private void print(Node head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        circularLL list = new circularLL();
        list.insertAtHead(3);
        list.insertAtHead(4);
        list.insertAtHead(5);
        list.insertAtHead(6);
        list.insertAtHead(7);
        list.print(head);
    }
}
