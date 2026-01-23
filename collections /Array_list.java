import java.util.*;
public class Array_list {
    public static void main(String[] args)
    {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        System.out.println(a);
        a.add(1,999);
        System.out.println(a);
        a.set(2,888);
        System.out.println(a);
        a.remove(2);
        System.out.println(a);
        a.remove(Integer.valueOf(30));
        System.out.println(a);
        ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(1,2,3));
        System.out.println(a1);
        a.addAll(a1);
        System.out.println(a);
        a.removeAll(a1);
        System.out.println(a);

        ArrayList<Integer> lst = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> lst1 = new ArrayList<>(Arrays.asList(1, 2));
        lst.retainAll(lst1);//Union
        System.out.println(lst);
    }
    

}
