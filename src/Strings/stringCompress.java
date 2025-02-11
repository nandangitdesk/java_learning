//package Strings;
//
//public class stringCompress {
//    public static void main(String[] args) {
//        String str = "aaabbccc";
//        System.out.println(stringCompress(str));
//    }
//
//    public static String stringCompress(String str) {
//        String newStr = "";
//        for (int i = 0; i < str.length(); i++) {
//            Integer count = 1;
//            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
//                count++;
//                i++;
//            }
//            newStr += str.charAt(i);
//            if (count > 1){
//               newStr += count.toString();
//            }
//
//        }
//
//        return  newStr;
//
//    }
//}

package Strings;

public class stringCompress {
    public static void main(String[] args) {
        String str = "aaabbccc";
        System.out.println(stringCompress(str)); // Output: a3b2c3
    }

    public static String stringCompress(String str) {
        // Use StringBuilder for efficient string manipulation
        StringBuilder compressedStr = new StringBuilder();

        // Iterate through the string
        for (int i = 0; i < str.length(); i++) {
            int count = 1; // Initialize count for the current character

            // Count consecutive repeated characters
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            // Append the current character to the compressed string
            compressedStr.append(str.charAt(i));

            // Append the count if it's greater than 1
            if (count > 1) {
                compressedStr.append(count);
            }
        }

        // Convert StringBuilder to a string and return
        return compressedStr.toString();
    }
}