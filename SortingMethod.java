package DuplicateIntegerSolution;

import java.util.Arrays;

public class SortingMethod {
    public static boolean hasDuplicate(int [] nums) {
        Arrays.sort(nums);
        int i;
        for (i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] nums={1,3,5,7,9};
        boolean result=hasDuplicate(nums);
        System.out.println("Contains Duplicate:" + result);
    }
}
