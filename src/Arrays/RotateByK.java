package src.Arrays;

import java.util.Scanner;

public class RotateByK {
    public static void rotate(int i , int j , int[] arr){
        while(i<=j){
            int temp = arr[i];
            arr[i++]=arr[j];
            arr[j--]=temp;
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
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter values in array:");
        for(int i = 0 ; i < n ; i++ ){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter value of k :");
        int k = sc.nextInt();
        k%=n;
        rotate(0,n-1, arr);
        rotate(0, k-1, arr);
        rotate(k, n-1, arr);
        print(arr);
        sc.close();
    }
}
