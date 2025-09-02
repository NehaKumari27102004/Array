package Arrays;
import java.util.*;
public class EvenOddBitwise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Check the given number is a even ya odd by using Bitwise:");
        System.out.print("Enter the num:");
        int num=sc.nextInt();
        if((num & 1)==1){
            System.out.println("Your given number is a odd");
        }else{
            System.out.println("Your given number is a even");
        }
    }
}
