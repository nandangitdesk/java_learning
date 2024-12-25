package Arrays;

public class CheckSorted {

    public static boolean isSorted(int[] arr) {

        if (arr == null || arr.length <= 1) {
            return true;
        }

        // Iterate through the array
        for (int i = 0; i < arr.length - 1; i++) {
            // Check if the current element is greater than the next element
            if (arr[i] > arr[i + 1]) {
                return false; // Not sorted
            }
        }

        return true; // Array is sorted
    }

    public static void main(String[] args) {
        // Test cases
        int[] sortedArray = {1, 2, 3, 4, 5};
        int[] unsortedArray = {5, 3, 2, 1};
        int[] singleElementArray = {42};
        int[] emptyArray = {};

        System.out.println("Is sortedArray sorted? " + isSorted(sortedArray)); // true
        System.out.println("Is unsortedArray sorted? " + isSorted(unsortedArray)); // false
        System.out.println("Is singleElementArray sorted? " + isSorted(singleElementArray)); // true
        System.out.println("Is emptyArray sorted? " + isSorted(emptyArray)); // true
    }
}
