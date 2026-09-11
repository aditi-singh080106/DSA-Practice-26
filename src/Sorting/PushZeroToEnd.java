package src.Sorting;

import java.util.Scanner;

public class PushZeroToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements:");
        int[] arr = new int[10];
        int noz=0;
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
            if(arr[i]==0) noz++;
        }
        for(int i=0;i<noz;i++){
            for(int j=0;j<10-1-i;j++){
                if(arr[j]==0){
                    arr[j]=arr[j+1];
                    arr[j+1]=0;
                }
            }
        }
        for(int i=0;i<10;i++){
            System.out.print(arr[i]+"\t");
        }
        sc.close();
    }
}
