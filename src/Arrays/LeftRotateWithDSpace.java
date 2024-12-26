package Arrays;

public class LeftRotateWithDSpace {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int d = 2;
        int n = arr.length;
        leftRotateByDSpaces(arr,d,n);

        for(int i = 0 ; i < n ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");


    }

    public static void leftRotateByDSpaces(int[] arr , int d , int n) {

        int temp[] = new int[d];
        for(int i = 0 ; i < d ; i++) {
            temp[i] = arr[i];
        }

        for(int i = d ; i < n ; i++) {
            arr[i-d] = arr[i];
        }

        for(int i = 0 ; i < d ; i++) {
            arr[i + n-d] = temp[i];
        }
    }
}
