package src.Pattern.Basic;

import java.util.Scanner;

public class NumberSquar2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = sc.nextInt();
        for(int i = 1 ; i <= size ; i++ ){
            for(int j = 1 ; j <= size ; j++ ){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
