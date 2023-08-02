class linkedlists {
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

    // insert at start
    public void insertAtHead(int data) {
        if (tail == null) {
            tail = head;
        }
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // insert at tail
    private void insertAtTail(int data) {
        if (tail == null) {
            insertAtHead(data);
            return;
        }
        Node newNode = new Node(data);
        tail.next = newNode;
        tail = newNode;
    }

    // insert at given index
    public void insertAtPosition(int position, int data) {

        // inserting at head
        if (position == 0) {
            insertAtHead(data);
            return;
        }
        int cnt = 0;
        Node newnode = head;
        while (cnt < position - 1) {
            newnode = newnode.next;
            cnt++;
        }

        // inserting at tail
        if (newnode.next == null) {
            insertAtTail(data);
            return;
        }

        // creating a Node for data
        Node nodeToInsert = new Node(data);
        nodeToInsert.next = newnode.next;
        newnode.next = nodeToInsert;
    }

    public void deleteNode(int position) {
        if (position == 0) {
            head = head.next;
        } else {
            Node temp = head;
            int cnt = 0;
            while ((temp != null && cnt < position - 1)) {
                temp = temp.next;
                cnt++;
            }
            if (temp != null && temp.next != null) {
                temp.next = temp.next.next;
            }
        }
    }

    public void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        linkedlists list = new linkedlists();

        // insertions
        list.insertAtHead(3);
        list.insertAtHead(2);
        list.insertAtHead(1);
        list.insertAtTail(4);
        list.insertAtPosition(4, 3);
        list.print(head);
        System.out.println(head.data);
        System.out.println(tail.data);

        // deletions
        list.deleteNode(0);
        list.print(head);
        System.out.println(head.data);
        System.out.println(tail.data);
    }
}