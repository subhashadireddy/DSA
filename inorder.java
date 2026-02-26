
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

public class trees_inorder {

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(20);
        root.right.left = new Node(15);
        inorder(root);
    }
    static void inorder(Node root) {

        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}
          
