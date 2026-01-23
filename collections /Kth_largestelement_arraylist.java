import java.util.ArrayList;
import java.util.Arrays;

public class Kth_largestelement {
    public static void main(String[] args)
    {
        ArrayList<Integer> lst = new ArrayList<>(Arrays.asList(3, 4,1,2,6));
        int max=0;
        int k=3;
        while(k-1>0)
        {
        for(Integer i : lst)
        {
            if(i>max)
            {
                max = i;
            }
        }
        lst.remove(max);
        k--;  }

        int max2 = 0;
        for (Integer i : lst) {
            if (i > max2) {
                max2 = i;
            }
        }
            System.out.println(max2);
        }
        }
