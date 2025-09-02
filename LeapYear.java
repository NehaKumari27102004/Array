package Arrays;
import java.net.SocketOption;
import java.util.*;

public class LeapYear {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to New Year Calculate:");
        System.out.print("Please enter the year that you want to check:");
        int year=sc.nextInt();
        if(year%400==0){
            System.out.println("Your year is a Leap Year");
        }else if( year % 100==0){
            System.out.println("Your year is not a Leap year");
        }else if (year%4==0){
            System.out.println("Your year is a Leap Year");
        }else{
            System.out.println("Your year is not a leap year");
        }
    }
}
