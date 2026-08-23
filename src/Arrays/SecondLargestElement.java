package src.Arrays;

import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter values : ");
        for(int i = 0 ; i < n ;  i++ ){
            nums[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE , smax = Integer.MIN_VALUE ;
        for(int i = 0 ; i < n ; i++ ){
            if(max<=nums[i]){
                smax = max ;
                max = nums[i];
            }
            else if(smax<nums[i] && smax<max) smax = nums[i];
        }
        System.out.println("Maximum is : "+max);
        System.out.println("Second maximum is :"+smax);
        sc.close();
    }
}
