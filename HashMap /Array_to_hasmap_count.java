import java.util.*;
public class Array_to_Hashma {
   public static void main(String[] args)
   {
    int[] a ={10,20,30,40,30,60,70,80};
    HashMap<Integer,Integer> hm = new HashMap<>();
    for(int i=0;i<a.length;i++)
    {
        // if(hm.containsKey(a[i]))
        // {
        //     hm.put(a[i],hm.get(a[i])+1);
        // }
        // else
        // {
        //     hm.put(a[i],1);
        // } or
        hm.put(a[i],hm.getOrDefault(a[i], 0)+1);
    }
    System.out.println(hm);
   } 
}
