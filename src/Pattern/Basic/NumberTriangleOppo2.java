package src.Pattern.Basic;

import java.util.Scanner;

public class NumberTriangleOppo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines:");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=num-i+1;j>0;j--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
