import java.util.Scanner;

public class BinarySearchFirstLastOneLogic {

    public static int[] firstAndLastOccurrence(int[] arr, int target) {
        int first = -1, last = -1;

        int l = 0, r = arr.length - 1;

        // First occurrence (move left on match)
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == target) {
                first = mid;
                r = mid - 1;
            } else if (arr[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        l = 0; 
        r = arr.length - 1;

        // Last occurrence (move right on match)
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == target) {
                last = mid;
                l = mid + 1;
            } else if (arr[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return new int[]{first, last};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        int[] res = firstAndLastOccurrence(arr, target);
        System.out.println("First: " + res[0]);
        System.out.println("Last: " + res[1]);
    }
}
