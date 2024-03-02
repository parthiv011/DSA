public class DFSTraversal {
    public static class Node {
        int data;
        Node left, right;

        Node(int key) {
            this.data = key;
        }
    }

    private static void printInorder(Node root) {
        if (root == null)
            return;

        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }

    private static int printPreOdrder(Node root) {
        if (root == null)
            return 0;

        System.out.print(root.data + " ");
        int leftHeight = printPreOdrder(root.left);
        int rightHeight = printPreOdrder(root.right);

        if (leftHeight > rightHeight) {
            return leftHeight + 1;
        } else {
            return rightHeight + 1;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        printInorder(root);
        System.out.println();
        // printPreOdrder(root);
        int ans = printPreOdrder(root);
        System.out.println();
        System.out.println("Height  of the tree is : " + ans);
    }
}
