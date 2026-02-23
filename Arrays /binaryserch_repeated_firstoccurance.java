import java.util.Scanner;
//FIRST OCCURANCE
public class binaryserch_repeated_firstoccurance{
  public static int binarySearch(int[] arr, int t) {
        int l = 0;
        int r = arr.length - 1;
        int ans = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == t) {
                ans = mid;
                r=mid-1;
                //l=mid+1; -- last occurance 
            } else if (arr[mid] < t) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int index = binarySearch(arr,target);
        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println("-1");
        }
    }
}

