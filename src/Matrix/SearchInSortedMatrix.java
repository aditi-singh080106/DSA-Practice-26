package src.Matrix;

import java.util.Scanner;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m:");
        int m = sc.nextInt();
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter elements:");
        for(int i = 0 ; i < m ; i++ ){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        } 
        System.out.println("Enter target element");
        int target = sc.nextInt();
        int i = 0 , j = n-1;
        while(i<m  && j>=0){
            if(arr[i][j]<target) i++;
            else if(arr[i][j]>target) j--;
            else {
                System.out.println(arr[i][j]);
                break;
            }
        }
        sc.close();
    }
}
