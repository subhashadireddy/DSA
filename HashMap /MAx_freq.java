import java.util.*;
public class maxFreq_hashmap {
    public static void main(String[] args)
    {
        HashMap<Integer,Integer> h = new HashMap<>();
        int[] a = {1,2,2,3,3,3,4,4,4,4,5,5,5,5};
        int m = Integer.MIN_VALUE;
        int k=-1;
        for(int i=0;i<a.length;i++)
        {
            h.put(a[i], h.getOrDefault(a[i], 0) + 1);
        }
        for(int x :h.keySet())
        {
            if(x>k && h.get(x)>=m || h.get(x)>m)
            {
                m=h.get(x);
                k=x;
            }
        }
        System.out.println(k+"-"+m);
    }    
}
