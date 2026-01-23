
import java.util.*;

public class countof_comm_even_arraylist {

    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>(Arrays.asList(3, 4, 2, 3, 1, 7, 6));
        ArrayList<Integer> lst1 = new ArrayList<>(Arrays.asList(7, 8, 3, 4, 5, 2));

        int count = 0;
        for (Integer num : lst) {
            if (num % 2 == 0 && lst1.contains(num)) {
                count++;
                System.out.println("common element:"+num);
            }
        }
        System.out.println(count);
    }
}

//or we can retain and check even condition and return the count 
