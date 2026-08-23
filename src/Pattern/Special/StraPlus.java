package src.Pattern.Special;

import java.util.Scanner;

public class StraPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines");
        int num = sc.nextInt();
        int mid = num/2+1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(i==mid||j==mid){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
