import java.util.Scanner;

public class ArrayContainsElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        System.out.print("Enter the number you want to search for: ");
        int target = scanner.nextInt();
        boolean found = false;
        for (int num : numbers) {
            if (num == target) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(" Yes! The array contains " + target);
        } else {
            System.out.println(" No, the array does not contain " + target);
        }

        scanner.close();
    }
}
