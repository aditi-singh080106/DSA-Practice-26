package src.Matrix;

import java.util.Scanner;

public class FlipScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m:");
        int m = sc.nextInt();
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter elements:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //flip 0 to 1 of row
        for(int i=0;i<m;i++){
            if(arr[i][0]==0){
                for(int j=0;j<n;j++){
                    if(arr[i][j]==0) arr[i][j]=1;
                    else arr[i][j]=0;
                }
            }
        }
        for(int j=0;j<n;j++){
            int noOfZeros= 0 , noOfOnes=0;
            for(int i=0;i<m;i++){
                if(arr[i][j]==0) noOfZeros++;
                else noOfOnes++;
            }
            if(noOfZeros>noOfOnes){
                for(int i=0;i<m;i++){
                    if(arr[i][j]==0) arr[i][j]=1;
                    else arr[i][j]=0;
                }
            }
        }
        int score = 0 , x = 1;
        for(int j=n-1;j>=0;j--){
            for(int i=0;i<m;i++){
                score+=(arr[i][j]*x);
            }
            x*=2;
        }
        System.out.println(score);
        sc.close();
    }
}
