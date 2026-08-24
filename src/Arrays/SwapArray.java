package src.Arrays;

import java.util.Scanner;

public class SwapArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter values: ");
        for(int i = 0 ; i < n ; i++ ){
            nums[i] = sc.nextInt();
        }
        int i = 0 , j = n-1 ;
        while(i<=j){
            int temp = nums[i];
            nums[i++]=nums[j];
            nums[j--]=temp;
        }
        for(int k = 0 ; k < n ; k++ ){
            System.out.print(nums[k]+"\t");
        }
        sc.close();
    }
}
