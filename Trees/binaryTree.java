public class binaryTree {
    public static class Node {
        int data;
        Node left, right;

        public Node(int key) {
            this.data = key;
        }
    }

    public void preOrder(Node root) {
        if (root == null)
            return;
        System.out.print(" " + root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    private void inOrder(Node root) {
        if (root == null)
            return;

        inOrder(root.left);
        System.out.print(" " + root.data);
        inOrder(root.right);
    }

    private void postOrder(Node root) {
        if (root == null)
            return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(" " + root.data);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.right = new Node(3);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);
        root.right.left = new Node(7);
        root.right.right = new Node(8);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);
        binaryTree tree = new binaryTree();
        System.out.print("Preorder Traversal : ");
        tree.preOrder(root);
        System.out.println();
        System.out.print("Inorder Traversal : ");
        tree.inOrder(root);
        System.out.println();
        System.out.print("Postorder Traversal : ");
        tree.postOrder(root);
    }
}