import java.util.*;
public class first_creation {
    public static void main(String[] args){
        int a[] = new int[3];
        a[0] = 3;
        a[1] = 4;
        a[2] = 5;
        int sum = a[0]+a[1]+a[2];
        System.out.println(sum);
        for (int num : a) {
            System.out.print(num + " ");
        }
        int b[] = {1,2,3,4,5};
        System.out.println(Arrays.toString(a));

    }
}
