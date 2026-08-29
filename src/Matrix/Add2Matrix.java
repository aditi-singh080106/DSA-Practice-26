package src.Matrix;

import java.util.Scanner;

public class Add2Matrix {
    public static void print(int[][] arr){
        for(int i = 0; i< arr.length ; i++ ){
            for(int j = 0 ; j < arr[0].length ; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row size:");
        int m = sc.nextInt();
        System.out.println("Enter col size:");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter elements :");
        for(int i = 0 ; i < m ; i++ ){
            for(int j = 0 ; j < n ; j++ ){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter row size:");
        int p = sc.nextInt();
        System.out.println("Enter col size:");
        int q = sc.nextInt();
        int[][] brr = new int[p][q];
        System.out.println("Enter elements:");
        for(int i = 0 ; i < p ; i++ ){
            for(int j = 0 ; j < q ; j++ ){
                brr[i][j]=sc.nextInt();
            }
        }
        if(p!=m && q!=n){
            System.out.println("Invalid Opration..!");
        }
        else{
            for(int i = 0 ; i < m ; i++ ){
                for(int j = 0 ; j < n ; j++ ){
                    arr[i][j]+=brr[i][j];
                }
            }
            print(arr);
        }
        sc.close();
    }
}
