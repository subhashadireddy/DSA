import java.util.*;
public class fib{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fib(n,new int[n+1]);   
        
    }
    public static void fib(int n , int[] a){
        a[0] = 0;
        a[1] = 1;
        for (int i = 2; i <= n; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        System.out.println("Fib of " + (n) + " is: " + a[n]);
        System.out.println(Arrays.toString(a));
    }
}
