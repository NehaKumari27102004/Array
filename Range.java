package Array;

import java.util.*;
public class Range {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int s,r;
        System.out.println("Enter the number of Sample:");
        s=sc.nextInt();
        System.out.println("Enter the number oef range:");
        r=sc.nextInt();

        System.out.println("Enter the numbers:");

        int[]a=new int[s];
        for(int i=0; i<s; i++){
            a[i]=sc.nextInt();
        }

        for(int i=0; i<r; i++){
            System.out.println("Enter the min and max range:");
            int left=sc.nextInt();
            int right=sc.nextInt();
            int count=0;
            for(int j=0; j<s; j++){
                if(a[j] >= left && a[j] <= right){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
