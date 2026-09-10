package src.Sorting;

import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements in array: ");
        int[] arr = new int[10];
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        //bubble sort
        for(int i=0;i<10;i++){
            for(int j=i+1;j<10;j++){
                if(arr[i]>=arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<10;i++){
            System.out.print(arr[i]+"\t");
        }
        sc.close();
    }
}
