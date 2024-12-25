package Arrays;

public class LargestElement {

    public static   int findLargest(int arr[]) {

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]){
                largest = arr[i];
            }
        }

        return largest;
    }

    public static int findSmallest(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }


    public static void main(String args[]) {
        int arr[] = {2,4,6,8,20,10,12};
        System.out.println("Largest Element: " + findLargest(arr));
        System.out.println("Smallest Element: " + findSmallest(arr));
    }
}
