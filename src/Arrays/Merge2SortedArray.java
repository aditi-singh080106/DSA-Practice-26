package src.Arrays;

import java.util.Scanner;

public class Merge2SortedArray {
    public static void print(int[] arr){
        for(int i = 0; i< arr.length ; i++ ){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        System.out.println("Enter values in 1st array in sorted manner:");
        for(int i = 0 ; i < n ; i++ ){
            a[i] = sc.nextInt(); 
        }
        System.out.println("Enter values in 2nd array in sorted manner:");
        for(int i = 0 ; i < n ; i++ ){
            b[i] = sc.nextInt();
        }
        int[] arr = new int[n+n];
        int i = 0 , j = 0 , k = 0 ;
        while(i<n && j<n){
            if(a[i]<=b[j]) arr[k++] = a[i++];
            else arr[k++] = b[j++];
        } 
        while(i<n) arr[k++] = a[i++];
        while(j<n) arr[k++] = b[j++];
        print(arr);
        sc.close();
    }
}
