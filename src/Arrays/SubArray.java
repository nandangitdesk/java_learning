package Arrays;

public class SubArray {

    public static void printSubArray(int numbers[]){

        int ts = 0;
        int totalSum = 0;
        int maxSum = Integer.MIN_VALUE;  //small value
        int minSum = Integer.MAX_VALUE;  // large value

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                int currSum = 0;

                for (int k = start; k <= end ; k++) {
                    System.out.print(numbers[k] + " ");
                    currSum += numbers[k];
                }

                if (currSum < minSum){
                   minSum = currSum;
                }

                if (currSum > maxSum){
                    maxSum = currSum;
                }

                totalSum += currSum;
                ts++;
                System.out.println("-> sum :" + currSum);
            }
            System.out.println(" ");
        }
        System.out.println("Total number of subarrays: " + ts);
        System.out.println("Sum of all subarrays: " + totalSum);
        System.out.println("Minimum subarray sum: " + minSum);
        System.out.println("Maximum subarray sum: " + maxSum);



    }

    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};

        printSubArray(numbers);
    }
}

//print subArrays
