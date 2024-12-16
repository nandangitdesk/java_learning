package Arrays;

//largest and smallest element in array

public class LargestOrSmallestInArray {

    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; //+infinity

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]){
                largest = numbers[i];
            }

            if (smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest number is :" + smallest);
        return largest;
    }

    public static void main(String args[]){
        int numbers[] = {1,2,3,6,7,4,9};
        System.out.println("largest element is : " + getLargest(numbers) );
    }
}
