package src.Sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements: ");
        int[] arr = new int[10];
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++){
            int min=Integer.MAX_VALUE;
            int minidx=-1;
            for(int j=i;j<10;j++){
                if(arr[j]<min){
                    min=arr[j];
                    minidx=j;
                }
            }
            int temp=arr[i];
            arr[i]=min;
            arr[minidx]=temp;
        }
        for(int i=0;i<10;i++){
            System.out.print(arr[i]+"\t");
        }
        sc.close();
    }
}
