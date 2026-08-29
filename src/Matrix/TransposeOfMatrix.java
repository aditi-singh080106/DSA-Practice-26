package src.Matrix;

import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row size:");
        int m = sc.nextInt();
        System.out.println("Enter column size:");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter elements:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //transpose
        for(int i=0;i<m;i++){
            for(int j=0;j<=i;j++){
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        //print transepose
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
