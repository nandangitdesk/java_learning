package Arrays;

public class LeftRotateAnArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");

        leftRotateByOne(arr);
        System.out.println("After left rotate by one");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    public static void leftRotateByOne(int[] arr){
        int temp = arr[0];
        for(int i = 0 ; i < arr.length - 1 ; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
    }
}
