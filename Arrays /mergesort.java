import java.util.*;
public class merging_sortedarrays {
    public static void main(String[] args)
    {
        int []a = {1,2,3,4,5};
        int []b = {6,7,8,9,10};
        int []c = new int[a.length+b.length];
        int i=0;
        int j=0;
        while(i<a.length && j<b.length)
        {
            if(a[i]<b[j])
            {
                c[i+j] = a[i];
                i++;
            }
            else{
                c[i+j] = b[j];
                j++;
            }
        }
        while(i<a.length)
        {
            c[i+j] = a[i];
            i++;
        }
        while(j<b.length)
        {
            c[i+j] =  b[j];
            j++;
        }
        System.out.println(Arrays.toString(c));
    }
}
