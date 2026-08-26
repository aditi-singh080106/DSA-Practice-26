package src.Arrays;

import java.util.Scanner;

public class NextGreaterElements {
    public static void print(int[] arr){
        for(int i = 0; i< arr.length ; i++ ){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++ ){
            arr[i]=sc.nextInt();
        }
        int[] ans = new int[n];
        ans[n-1]=-1;
        int nge = arr[n-1];
        for(int i = n-2; i >= 0 ; i-- ){
            ans[i] = nge;
            nge=Math.max(nge, arr[i]);
        } 
        print(ans);
        sc.close();
    }
}
