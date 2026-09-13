package src.Sorting;

import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements:");
        int[] arr = new int[10];
        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        //insertion sort
        for(int i=1;i<10;i++){
            for(int j=i;i>=1;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else break;
            }
        }
        System.out.println("Majorirty Element is:"+arr[10/2]);
        sc.close();
    }
}
