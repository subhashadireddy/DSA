
import java.util.*;
public class fib_memorization{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = fib(n, new int[n + 1]);
        System.out.println(ans);
    }
    public static int fib(int n,int[] a) {
        a[1] = 1;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if(a[n]!=0) return a[n];
        return a[n] = fib(n - 1,a) + fib(n - 2,a);
    }
}
