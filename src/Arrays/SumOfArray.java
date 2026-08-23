package src.Arrays;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int n = sc.nextInt();
        int sum = 0 ;
        int[] nums = new int[n];
        System.out.println("Enter values:");
        for(int i = 0 ; i < n ; i++ ){
            nums[i] = sc.nextInt();
            sum+=nums[i];
        }
        System.out.println("Sum of array is : "+sum);
        sc.close();
    }
}
