package Array;
// Java program to find the third largest
// element in an array.
import java.util.*;

class GfG {
    static int Thirdlargestelement(int[] arr) {
        int n = arr.length;

        // Sort the array
        Arrays.sort(arr);

        // Return the third largest element
        return arr[n - 3];
    }

    public static void main(String[] args) {
        int[] arr = {1, 14, 2, 16, 10, 20};
        System.out.println(Thirdlargestelement(arr));
    }
}