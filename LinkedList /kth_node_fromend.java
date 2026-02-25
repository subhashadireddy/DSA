
class Node {

    int data;
    Node next;

    Node(int d) {
        this.data = d;
        this.next = null;
    }
}
public class k_node_from_last {
    
    public static void main(String[] args) {
        Node head = new Node(10);
        insert(head, 20);
        insert(head, 30);
        insert(head, 40);
        display(head);
        l(head,3);
    }

    static void insert(Node ob, int x) {
        Node nn = new Node(x);
        Node t = ob;
        while (t.next != null) {
            t = t.next;
        }
        t.next = nn;

    }

    static void l(Node ob , int k) {
        
        Node f =ob;
        while(k-1!=0)
        {
            f=f.next;
            k--;
        }
        Node s =ob;
        while(f.next!=null)
        {
            s=s.next;
            f=f.next;
        }
        System.out.println( s.data);
    }

    static void display(Node ob) {
        Node t = ob;
        while (t != null) {
            System.out.println(t.data);
            t = t.next;
        }

    }
}
