package Arrays;

public class PairsOfArray {

    public static void pairsOfArray(int numbers[]){
        int top = 0;

        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i]; // 2,4,6,8,10,12
            for (int j = i+1; j < numbers.length ; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ")" );
                top++;
            }
            System.out.println(" ");
        }

        System.out.println("Total no of pairs are : " + top);

    }

    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10,12};

        pairsOfArray(numbers);
    }
}


//**imp**
//total no of pairs = n(n-1)/2
