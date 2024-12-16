import java.util.Scanner;

public class ArrayCC {
    public static void main(String args[]){
        //creating an array
        int marks[] = new int[50];
        //arrays length
        System.out.println("length of array is:" + marks.length);
        //inputing and updating

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your phy marks");
        marks[0] = sc.nextInt();
        System.out.println("Enter your chem marks");
        marks[1] = sc.nextInt();
        System.out.println("Enter your math marks");
        marks[2] = sc.nextInt();

        System.out.println("phy marks" + marks[0]);
        System.out.println("chem marks" + marks[1]);
        System.out.println("math marks" + marks[2]);

    }
}
