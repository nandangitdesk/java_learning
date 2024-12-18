package Arrays;

public class KadaneMethod {

    public static void kadane(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            currSum = currSum + numbers[i];

            if (currSum < 0){
                currSum = 0;
            }

            maxSum = Math.max(currSum,maxSum);
        }

        System.out.println("Maximum subArray is : " + maxSum);
    }

    public static void main(String args[]){
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        kadane(numbers);
    }
}

// - me value rahi to zero bana na like isme { -2 = 0 , -3 = 0 , 4 , 4+ -1 = 3 , ... aise