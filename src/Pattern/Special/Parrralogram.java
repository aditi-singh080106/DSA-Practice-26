package src.Pattern.Special;

import java.util.Scanner;

public class Parrralogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size:");
        int nst = sc.nextInt();
        int nsp = nst-1;
        for(int i=1;i<=nst;i++){
            for(int j=1;j<=nsp-i+1;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
