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
public class tree_search {
    public static void main(String[] args) {
        Node root = null;
        root = insert(root, 10);
        root = insert(root, 5);
        root = insert(root, 7);
        root = insert(root, 2);
        root = insert(root, 8);
        inorder(root);
        int searchelement = 5;
        if(search(root,searchelement))
        {
            System.out.println("Element Found");
        }
        else{
            System.out.println("Not found");
        }
        
    }
    static boolean search(Node root , int element)
    {
        if(root == null)
        {
            return false;
        }
        if(root.data == element)
        {
            return true;
        }
        if(element < root.data)
        {
            return search(root.left,element);
        }
        else{
            return search(root.right,element);
        }
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
}
