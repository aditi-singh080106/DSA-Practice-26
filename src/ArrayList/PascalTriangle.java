package src.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row size:");
        int m = sc.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i = 0 ; i < m ; i++ ){
            ArrayList<Integer> a = new ArrayList<>();
            for(int j = 0 ; j <= i ; j++ ){
                a.add(1);
            }
            arr.add(a);
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<i;j++){
                arr.get(i).set(j,arr.get(i-1).get(j)+arr.get(i-1).get(j-1));
            }
        }
        for(ArrayList<Integer> a : arr){
            System.out.println(a);
        }
        sc.close();
    }
}
