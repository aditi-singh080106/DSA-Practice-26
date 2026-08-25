package src.Arrays;

import java.util.Scanner;

public class SortZerosZndOnes {
    public static void sort(int n , int[] arr){
        int i = 0 , j = n-1;
        while(i<=j){
            if(arr[i]==1){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j--]=temp;
            }
            else i++;
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
        System.out.println("Enter the size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter values in array:");
        for(int i = 0 ; i < n ; i++ ){
            arr[i]=sc.nextInt();
        }
        sort(n, arr);
        print(arr);
        sc.close();
    }
}
