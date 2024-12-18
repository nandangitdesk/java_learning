package Arrays;

public class MaxSubArray {

    public static void getMaxSubArrays(int numbers[]) {
        int maxSum = Integer.MIN_VALUE; // Initialize to the smallest possible value

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int currSum = 0;
                int end = j;


                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                    currSum += numbers[k];
                }


                System.out.println("-> Sum: " + currSum);


                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
            System.out.println(" ");
        }

        // Print the maximum sum
        System.out.println("Maximum sum of subarrays: " + maxSum);
    }

    public static void main(String args[]) {
        int numbers[] = {1,-2,6,-1,3};

        getMaxSubArrays(numbers);
    }
}

//O(n3) - brute force