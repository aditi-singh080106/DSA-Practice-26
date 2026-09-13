package src.Sorting;

import java.util.Scanner;

public class TransformArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements : ");
        int[] arr = new int[10];
        for(int i=0;i<10;i++){
            arr[i]=sc.nextShort();
        }
        //transforming array
        for(int i=1;i<10;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp ;
                }
                else break;
            }
            for(int k=0;k<10;k++){
                System.out.print(arr[k]+"\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
