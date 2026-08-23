package src.Arrays;

import java.util.Scanner;

public class MaximumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter values:");
        for(int i = 0 ; i < n ; i++ ){
            nums[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++ ){
            if(max<=nums[i]) max=nums[i];
        }
        System.out.println("Maximum value : "+max);
        sc.close();
    }
}
