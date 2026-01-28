public class largestinarray {
    public static int Great(int num[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > largest) {
                largest = num[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int num[] = {2, 3, 4, 5, 6, 7};
        System.out.println("Largest number is:"+ Great(num));
    }
}
