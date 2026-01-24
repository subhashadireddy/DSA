import java.util.*;
public class hashmap {
    public static void main(String[] args)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(1,10);
        hm.put(2,20);
        hm.put(3,30);
        hm.put(4,40);
        System.out.println(hm);
        System.out.println(hm.get(3));//30
        System.out.println(hm.get(4));//40
        System.out.println(hm.getOrDefault(5,100));
        for(int x: hm.keySet())
        {
            System.out.println(x+" - "+hm.get(x));
        }
    }
}
