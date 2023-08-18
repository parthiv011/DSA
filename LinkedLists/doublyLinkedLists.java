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

    // insertions in doubly Linked Lists
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
        Node temp = head;
        while (cnt < position - 1) {
            temp = temp.next;
            ++cnt;
        }
        if (temp.next == null) {
            insertAtTail(data);
            return;
        }
        Node nodeToInsert = new Node(data);
        nodeToInsert.next = temp.next;
        temp.next.prev = nodeToInsert;
        temp.next = nodeToInsert;
        nodeToInsert.prev = temp;
    }

    // Deletions in Doubly linked lists
    private void deleteNode(int position) {
        // from head
        if (position == 0) {
            if (head != null) {
                head = head.next;
                if (head != null) {
                    head.prev = null;
                }
            }
            System.out.println("Deleted from head!");
        } else {
            Node temp = head;
            int cnt = 0;

            while (temp != null && cnt < position - 1) {
                temp = temp.next;
                cnt++;
            }

            if (temp == null || temp.next == null) {
                System.out.println("POsition out of range");
                return;
            }
            temp.next = temp.next.next;
            if (temp.next != null) {
                temp.next.prev = temp;
            }
            System.out.println("Deleted success!");
        }
    }

    // size of Linked List
    private int getLength(Node head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
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
        dlist.insertAtPosition(3, 2);
        dlist.print(head);
        dlist.deleteNode(0);

        System.out.println("Size : " + dlist.getLength(head));
        System.out.println("Head : " + head.data);
        System.out.println("Tail : " + tail.data);
    }
}