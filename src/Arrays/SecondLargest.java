package Arrays;

public class SecondLargest {

    public static int findSecondLargest(int arr[]){
        if (arr == null || arr.length == 1){
            throw new IllegalArgumentException("Array must have length of 2");
        }

        int Largest = Integer.MIN_VALUE;
        int SecondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Largest){
                SecondLargest = Largest;
                Largest = arr[i];
            } else if (arr[i] > SecondLargest && arr[i] != Largest) {
                SecondLargest = arr[i];
            }
        }

            return SecondLargest;

    }

        public static void main(String[] args) {
            int[] arr = {12, 35, 1, 10, 34, 1};
            System.out.println("Second Largest Element: " + findSecondLargest(arr));
        }
}
