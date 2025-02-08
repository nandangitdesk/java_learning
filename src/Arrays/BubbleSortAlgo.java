package Arrays;

public class BubbleSortAlgo {

    public static void bubbleSort(int numbers[]) {
        for (int turn = 0; turn < numbers.length-1; turn++) {
            for (int j = 0; j < numbers.length-1-turn; j++) {
                if (numbers[j] > numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
    }

    public static void printArray(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(" ");
    }

    //selectionSorting - O(n^2)
    public static void selectionSort(int numbers[]){
        for (int i = 0; i < numbers.length-1; i++) {
            int maxPosition = i;
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[j] < numbers[maxPosition]){
                    maxPosition = j;
                }
            }
            int temp = numbers[maxPosition];
            numbers[maxPosition] = numbers[i];
            numbers[i] = temp;
        }
    }

    //insertion sort
    public  static void insertionSort(int numbers[]) {
        for (int i = 1; i < numbers.length ; i++) {
            int curr = numbers[i];
            int prev = i-1;
            while (prev >=0 && numbers[prev] > curr){
                numbers[prev+1] = numbers[prev];
                prev--;
            }
            //insertion -
            numbers[prev+1] = curr;
        }
    }

    public static void main(String args[]) {
        int numbers[] = {5,6,2,1,4,3};

//        bubbleSort(numbers);
//          selectionSort(numbers);
        insertionSort(numbers);
        printArray(numbers);

    }
}
