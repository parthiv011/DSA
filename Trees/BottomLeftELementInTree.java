import java.util.LinkedList;
import java.util.Queue;

public class BottomLeftELementInTree {
    public static class Node {
        int data;
        Node left, right;

        Node(int key) {
            this.data = key;
        }
    }

    private static int findBottom(Node root) {
        int ans = root.data;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            ans = q.peek().data;
            for (int i = 0; i < size; ++i) {
                Node node = q.poll();
                if (node.right != null)
                    q.add(node.right);
                if (node.left != null)
                    q.add(node.left);
            }
        }
        return ans;
    }

    private static void printPreOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        printPreOrder(root);
        System.out.println("Bottom most Element : " + findBottom(root));
    }
}
