package src.Matrix;
import java.util.*;
public class SetZeroMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row:");
        int m = sc.nextInt();
        System.out.println("Enter col:");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter elements:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        //set row zeros
        for(int i=0;i<m;i++){
            if(row[i]){
                for(int j=0;j<n;j++){
                    arr[i][j]=0;
                }
            }
        }
        //set cols zeros
        for(int j=0;j<n;j++){
            if(col[j]){
                for(int i=0;i<m;i++){
                    arr[i][j]=0;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
