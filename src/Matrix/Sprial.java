package src.Matrix;

import java.util.Scanner;

public class Sprial {
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
        int minc = 0 , minr = 0 , maxc = n-1 , maxr = m-1;
        while(minr<=maxr && minc <= maxc){
            for(int j = minc ; j <= maxc ; j++){
                System.out.print(arr[minr][j]+"\t");
            }
            minr++;
            if(minr>maxr || minc>maxc) break;
            for(int i = minr ; i <= maxr ; i++ ){
                System.out.print(arr[i][maxc]+"\t");
            }
            maxc--;
            if(minr>maxr || minc>maxc) break;
            for(int j = maxc ; j>=minc ; j--){
                System.out.print(arr[maxr][j]+"\t");
            }
            maxr--;
            if(minr>maxr || minc>maxc) break;
            for(int i = maxr ; i>= minr ; i--){
                System.out.print(arr[i][minc]+"\t");
            }
            minc++;
        }
        sc.close();
    }
}
