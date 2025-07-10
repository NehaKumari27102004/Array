package DuplicateIntegerSolution;

import java.util.HashSet;
import java.util.Set;

public class BruteForceMethod {
    public static boolean hasDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 2}; // Example input
        boolean result = hasDuplicate(nums);
        System.out.println("Contains duplicate: " + result);
    }
}
