import java.util.*;
public class BinarySearch2D {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [][]a= new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        int target = sc.nextInt();
        int low = 0;
        int high = n * n - 1;

        while(low<=high)
        {
            int mid = low + (high-low)/2;
            int r = mid / n;
            int c = mid % n;
            int val = a[r][c];
            if(val == target){
                System.out.println("Found");
                break;
            }
            else if (val<target)
            {
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
    }
}
