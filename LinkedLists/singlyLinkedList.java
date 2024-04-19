public class singlyLinkedList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        Node(Node next, int data) {
            this.data = data;
            this.next = next;
        }
    }

    private void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    private int size(Node head) {
        int cnt = 0;
        while (head != null) {
            cnt++;
            head = head.next;
        }
        return cnt;
    }

    private static Node convertArr2LL(int arr[]) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private Node deleteAtHead(Node head) {
        if (head == null)
            return head;
        head = head.next;
        return head;
    }

    private Node deleteAtTail(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    private Node deleteByKPositions(Node head, int k) {
        if (head == null)
            return head;
        if (k == 1) {
            head = head.next;
            return head;
        }

        int cnt = 0;
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            cnt++;
            if (cnt == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    private Node deleteByValue(Node head, int val) {
        if (head == null)
            return head;
        if (head.data == val) {
            head = head.next;
            return head;
        }

        Node temp = head;
        Node prev = null;
        while (temp != null) {
            if (temp.data == val) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    private Node insertAtHead(Node head, int val) {
        return new Node(head, val);
    }

    private Node insertAtTail(Node head, int val) {
        if (head == null) {
            return new Node(val);
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        return head;
    }

    private Node insertAtKPosition(Node head, int val, int k) {
        if (head == null) {
            if (k == 1) {
                return new Node(val);
            } else {
                return head;
            }
        }

        if (k == 1) {
            return new Node(head, val);
        }
        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            cnt++;
            if (cnt == (k - 1)) {
                Node x = new Node(temp.next, val);
                temp.next = x;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    private Node insertBeforeValue(Node head, int val, int beforeVal) {
        if (head == null) {
            return null;
        }
        if (head.data == beforeVal) {
            return new Node(head, val);
        }

        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data == beforeVal) {
                Node x = new Node(temp.next, val);
                temp.next = x;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        Node head = convertArr2LL(arr);
        singlyLinkedList ll = new singlyLinkedList();
        // ll.printLL(head);
        // int size = ll.size(head);
        // System.out.println(size);
        // head = ll.deleteAtHead(head);
        // ll.printLL(head);
        // head = ll.deleteAtTail(head);
        // ll.printLL(head);
        // head = ll.deleteByKPositions(head, 2);
        // ll.printLL(head);
        // head = ll.deleteByValue(head, 3);
        // ll.printLL(head);

        head = ll.insertAtHead(head, 100);
        head = ll.insertAtTail(head, 45);
        head = ll.insertAtKPosition(head, 40, 4);
        head = ll.insertBeforeValue(head, 111, 40);
        ll.printLL(head);
    }
}
