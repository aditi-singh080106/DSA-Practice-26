package src.Pattern.Composite;

import java.util.Scanner;

public class NumberTriangle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines: ");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(i+j>num){
                    System.out.print((i+j-num)+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
