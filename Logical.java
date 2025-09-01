package Arrays;

import java.util.Scanner;

public class Logical {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println(" welcome to Ticket Discount Calculator:");
        System.out.println("Enter the Your Age:");
        int age=input.nextInt();
        System.out.println("Are you a female? (true/false)");
        boolean isFemale=input.nextBoolean();
        if( age < 5){
            System.out.println("You got 75% discount");
        }else if(isFemale){
            System.out.println("You got 50% Discount");
        }else if(age > 60 && !isFemale){
            System.out.println("You got 25% Discount");
        }else{
            System.out.println("You got no Discount");
        }
    }
}
