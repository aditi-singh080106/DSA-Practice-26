package src.Arrays;

import java.util.Scanner;

public class DutchNationalFlagAlgo {
    public static void sort(int n , int[] arr){
        int i = 0 , j = 0 , k = n-1;
        while(j<=k){
            if(arr[j]==0){
                int temp = arr[j];
                arr[j++]=arr[i];
                arr[i++]=temp;
            }
            else if(arr[j]==1) j++;
            else{
                int temp = arr[j];
                arr[j]=arr[k];
                arr[k--]=temp;
            }
        }
    }
    public static void print(int[] arr){
        for(int i = 0; i< arr.length ; i++ ){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter values:");
        for(int i = 0 ; i < n ; i++ ){
            arr[i] = sc.nextInt();
        }
        sort(n,arr);
        print(arr);
        sc.close();
         
    }
}
