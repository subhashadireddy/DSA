import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KthSmallestElement {

    public static int findKthSmallest(List<Integer> list, int k) {
        // Input validation (optional but recommended)
        if (list == null || list.isEmpty() || k <= 0 || k > list.size()) {
            throw new IllegalArgumentException("Invalid input: List is null/empty or k is out of range.");
        }

        // Sort the ArrayList in ascending order
        Collections.sort(list);

        // The k-th smallest element is at the (k-1)-th index (due to 0-based indexing)
        return list.get(k - 1);
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(10);
        numbers.add(4);
        numbers.add(3);
        numbers.add(20);
        numbers.add(15);

        int k = 3; // We want to find the 3rd smallest element
        try {
            int kthSmallest = findKthSmallest(numbers, k);
            System.out.println("The original list: " + numbers);
            System.out.println("The " + k + "th smallest element is: " + kthSmallest); // Output: The 3rd smallest element is: 7
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
