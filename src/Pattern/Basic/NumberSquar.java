package src.Pattern.Basic;

import java.util.Scanner;

public class NumberSquar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines:");
        int line = sc.nextInt();
        for(int i = 1 ; i <= line ; i++ ){
            for(int j = 1 ; j<= line ; j++ ){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
