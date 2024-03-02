import java.util.*;

public class iterativeTraversals {
    public static class Node {
        int key;
        Node left, right;

        Node(int data) {
            this.key = data;
        }
    }

    private static List<Integer> inOrder(Node root) {
        List<Integer> ans = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        Node curr = root;

        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            ans.add(curr.key);
            curr = curr.right;
        }

        return ans;
    }

    private static List<Integer> preOrder(Node root) {
        List<Integer> ans = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        if (root == null) {
            return ans;
        }

        while (!stack.isEmpty()) {
            Node temp = stack.pop();
            ans.add(temp.key);
            // Push the right child before the left child so that we can get the "pre-order"
            // traversal
            if (temp.right != null) {
                stack.push(temp.right);
            }

            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
        return ans;
    }

    private static List<Integer> postOrder(Node root) {
        List<Integer> ans = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        Node prev = null;

        if (root == null) {
            return ans;
        }

        stack.push(root);

        while (!stack.isEmpty()) {
            Node current = stack.peek();
            if (prev == null || prev.left == current || prev.right == current) { // Traverse down the tree
                if (current.left != null) {
                    stack.push(current.left);
                } else if (current.right != null) {
                    stack.push(current.right);
                }
            } else if (current.left == prev) { // Traverse up from the left
                if (current.right != null) {
                    stack.push(current.right);
                }
            } else { // Traverse up from the right or root
                ans.add(current.key);
                stack.pop();
            }
            prev = current;
        }
        return ans;
    }

    private static void printTree(Node root) {
        System.out.println("Inorder : " + inOrder(root));
        System.out.println("Preorder: " + preOrder(root));
        System.out.println("Postorder: " + postOrder(root));
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.right = new Node(2);
        root.right.left = new Node(3);
        printTree(root);
    }
}
