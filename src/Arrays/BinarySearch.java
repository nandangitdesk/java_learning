package Arrays;

public class BinarySearch {
    public static int binarySearch(int numbers[] , int key){
        int start = 0;
        int end = numbers.length-1;

        while(start <= end){
            int mid = (start + end )/2;

            if (numbers[mid] == key){ //found
                return mid;
            }

            if (numbers[mid] < key){ //right
                 start = mid + 1;
            }

            if (numbers[mid] > key ){
                 end = mid -1 ;
            }

        }

        return -1;
    }

    public static void main (String args[]){
        int numbers[] = {1,2,4,6,9,11,15};
        int key = 9;

        System.out.println("number found at : " + binarySearch(numbers,key));
    }
}
