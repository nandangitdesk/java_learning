package Arrays;

public class MaxSubArrayPrefixM {

    public static void getMaxSubArrays(int numbers[]) {

        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];

        for (int i = 1; i < numbers.length ; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        int maxSum = Integer.MIN_VALUE; // Initialize to the smallest possible value

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i; j < numbers.length; j++) {

                int currSum = (i == 0) ? prefix[j] : prefix[j] - prefix[i - 1];

                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
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