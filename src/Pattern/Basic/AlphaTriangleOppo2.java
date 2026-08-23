package src.Pattern.Basic;

import java.util.Scanner;

public class AlphaTriangleOppo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number lines:");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i+1;j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
