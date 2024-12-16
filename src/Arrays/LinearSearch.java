package Arrays;

public class LinearSearch {

    public static int linearSearch(String Menu[] ,String key){
        for (int i = 0; i < Menu.length; i++) {
            if (Menu[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        String Menu[] = {"Dosa" , "Frankie" , "Bhel" , "Samosa" , "Vadapav"};
        String key = "Samosa";

        int indexResult = linearSearch(Menu,key);

        if (indexResult == -1){
           System.out.println("Not Found");
        }else{
            System.out.println("index at:" + indexResult);
        }

    }

}
