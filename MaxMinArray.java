public class MaxMinArray {
    public static void main(String[] args){
        int [] arr={3,6,11,33,56,1};
        int max=arr[0];
        int min=arr[0];
        for(int num:arr){
            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }
        }
        System.out.println("Max number:" + max);
        System.out.println("Min number:" + min);
    }
}
