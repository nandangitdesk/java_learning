package Strings;

import java.util.Scanner;

public class StringsDemo {
    public static void main(String[] args) {
        char stringDemo[] = {'H', 'e', 'l', 'l', 'o'};
        String s = "Hello";
        String str = new String("Hello");

        //Strings are immutable in java , cannot be changed
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your name");
//        String name = sc.nextLine();
//        System.out.println(name);

//        System.out.println(name.length());
//        System.out.println(str);

        //concatenation
        String s1 = "Hello";
        String s2 = "World";
        System.out.println(s1 + s2);

        //string methods
        String s3 = "Hello";
        System.out.println(s3.length());
        System.out.println(s3.substring(1, 4));
        System.out.println(s3.toUpperCase());
        System.out.println(s3.toLowerCase());
        System.out.println(s3.trim());
        System.out.println(s3.replace("l", "L"));
        System.out.println(s3.charAt(0));

        String printString = "Rohit Sharma";
        printString(printString);
    }

    public static void printString(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
        System.out.println(" ");
    }
}
