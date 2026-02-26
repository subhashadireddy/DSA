class Node {
    Node left;
    Node right;
    int data;

    Node(int d) {
        this.data = d;
        this.left = null;
        this.right = null;
    }
}

public class tree_insert_method {

    public static void main(String[] args) {
        Node root = null;

        root = insert(root, 10);
        root = insert(root, 5);
        root = insert(root, 7);
        root = insert(root, 2);
        root = insert(root, 8);

        inorder(root);
    }

    // Insert method (BST insert)
    static Node insert(Node root, int x) {
        if (root == null) {
            return new Node(x);
        }
        if (x < root.data) {
            root.left = insert(root.left, x);
        } else {
            root.right = insert(root.right, x);
        }
        return root;
    }

    // Inorder traversal
    static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}
