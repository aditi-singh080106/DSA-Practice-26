package src.Pattern.Basic;

import java.util.Scanner;

public class AlphaNumberTriangle {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines:");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            if(i%2!=0){
                for(int j = 1; j<=i;j++){
                    System.out.print(j+" ");
                }
            }
            else{
                for(int j = 1; j<=i;j++){
                System.out.print((char)(j+64)+" ");
            }
            }
            System.out.println();
        }
        sc.close();
    }
}
