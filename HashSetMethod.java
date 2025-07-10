package DuplicateIntegerSolution;

import java.util.HashSet;
import java.util.Set;
public class HashSetMethod {
    public static boolean hasDuplicate(int[] nums) {
        Set seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4, 5,7,5}; // Example input
        boolean result = hasDuplicate(nums);
        System.out.println("Contains duplicate: " + result);
    }
}
