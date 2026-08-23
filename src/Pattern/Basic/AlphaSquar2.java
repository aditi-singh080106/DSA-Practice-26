package src.Pattern.Basic;

import java.util.Scanner;

public class AlphaSquar2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines:");
        int num = sc.nextInt();
        for(int i = 1 ; i <= num ; i++ ){
            for(int j = 1 ; j <= num ; j++ ){
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

