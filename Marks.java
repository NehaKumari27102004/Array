package Arrays;

import java.util.*;
public class Marks {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks for select grades");
        int marks=sc.nextInt();
        if(marks >= 90){
            System.out.println("Above the (0 % Marks Show Grade A");
        }else if(marks >= 75){
            System.out.println("Grade B");
        }else if(marks >= 60){
            System.out.println("Grade C");
        }else if(marks >=30){
            System.out.println("Grade D");
        }else{
            System.out.println("Grade F");
        }
    }
}
