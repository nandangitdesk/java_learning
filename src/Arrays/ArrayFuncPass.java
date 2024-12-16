package Arrays;

public class ArrayFuncPass {

    public static int update(int marks[], int unchangeNumber){
         unchangeNumber = 10;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }

        return 1;
    }

    public static void main(String args[]){
        int marks[] = {98,90,95};
        int unchangeNumber = 5;

        update(marks,unchangeNumber);

        System.out.println(unchangeNumber);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }

        System.out.println(" ");
    }
}

//aise situation me arrays by reference pass hote hai
