package src.Arrays;

import java.util.Scanner;

public class ProductOfArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int prod = 1;
        int[] nums = new int[n];
        System.out.println("Enter values in array: ");
        for(int i = 0 ; i < n ; i++ ){
            nums[i] = sc.nextInt();
            prod*=nums[i];
        }
        System.out.println("Product of array is : "+prod);
        sc.close();
    }
}
