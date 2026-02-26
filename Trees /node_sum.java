
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

public class trees_sum {

    public static void main(String[] args) {
        Node root = null;
        root = insert(root, 10);
        root = insert(root, 5);
        root = insert(root, 7);
        root = insert(root, 2);
        root = insert(root, 8);
        inorder(root);
        int sum_nodes = sum(root);
        System.out.println("The Sum of the Nodes is:"+sum_nodes);

    }

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

    static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    static int cal =0;
    static  int sum(Node root)
    {
        if(root == null){
            return cal;
        }
        sum(root.left);
        sum(root.right);
        cal = cal +root.data;
        return cal;
        //if you want to add from top to bottom
        //return root.data+sum(root.lrft)+sum(root.right)

    }
}
