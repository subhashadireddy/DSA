class Node{
    int data;
    Node next;
    Node(int d){
        this.data = d;
        this.next = null;
    }
}
public class linkedlist{
    public static void main(String []args)
    {
        Node head = new Node(10);
        insert(head,20);
        insert(head,30);
        insert(head,40);
        display(head);
    }
    static void insert(Node ob , int x)
    {
        Node nn = new Node(x);
        Node t = ob;
        while(t.next!=null)
        {
            t=t.next;
        }
        t.next = nn;

    }
    static void display(Node ob){
        Node t = ob;
        while(t!=null)
        {
            System.out.println(t.data);
            t=t.next;
        }

    }

}
