package src.Pattern.Special;

import java.util.Scanner;

public class PalindromePyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++ ){
            int a = 0;
            for(int j = 1 ; j <= n-i ; j++ ){
                System.out.print("  ");
            }
            for(int j = 1 ; j <= 2*i-1 ; j++ ){
                if(j<=i){
                    System.out.print((a+1) +" ");
                    a++;
                }
                else{
                    System.out.print((a-1) +" ");
                    a--;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}