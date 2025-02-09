package Strings;

public class largestString {
    //Question - for a given set of strings find the largest string
    //example - "apple" , "mango" , "banana"
    //lexicographical order
    // str1.compareTo(str2)
    // 0 : equal
    // -ve : str1 < str2
    // +ve : str1 > str2

    public static void main(String[] args) {
         String  fruits[] = {"apple" , "mango" , "banana"};

         String largest = fruits[0];

         for (int i = 1; i < fruits.length; i++) {
             if (largest.compareTo(fruits[i]) < 0) {
                 largest  = fruits[i];
             }
         }

         System.out.println(largest);

    }

}
