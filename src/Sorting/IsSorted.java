package src.Sorting;

import java.util.Scanner;

public class IsSorted {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter array element:");
        int[] arr= new int[10];
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        } 
        boolean flag = true;
        for(int i=0;i<9;i++){
            if(arr[i]>arr[i+1]){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("Given array is sorted..!");
        }else{
            System.out.println("Given array is not sorted..!");
        }
        sc.close();
    }
}
