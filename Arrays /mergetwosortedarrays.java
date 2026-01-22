import java.util.*;
public class mergetwosortedarrays {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int nums1[] = {1,2,3,3};
        int nums2[] = {4,4,5,6,7,7,8};
        int m=nums1.length;
        int n=nums2.length;
        int nums3[] = new int[m+n];
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
       
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums3[k] = nums1[i];
                k--;
                i--;
            } else {
                nums3[k] = nums2[j];
                k--;
                j--;
            }
        }
        while (j >= 0) {
            nums3[k] = nums2[j];
            k--;
            j--;

        }
        while (i >= 0) {
            nums3[k] = nums1[i];
            k--;
            i--;
        }
        System.out.println(Arrays.toString(nums3));

    }
    
}
