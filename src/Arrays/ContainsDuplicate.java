package Arrays;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,1};
        System.out.println(containsDuplicate(nums));
    }
}


// Given an array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.