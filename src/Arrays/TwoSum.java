package src.Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter values:");
        for(int i = 0 ; i < n ; i++ ){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter val:");
        int val = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < n ; i++ ){
            if(map.containsKey(nums[i])){
                int freq = map.get(nums[i])+1;
                map.put(nums[i],freq);
            }
            else map.put(nums[i],1);
        }
        for(int i = 0 ; i < n ; i++ ){
            int rem = val - nums[i];
            if(map.containsKey(rem) && rem!=nums[i] && map.get(rem)>0){
                System.out.println("Pairs are : "+nums[i]+" :: "+rem);
                break;
            }
            else if(map.containsKey(rem) && rem==nums[i] && map.get(rem)>1){
                System.out.println("Pairs are : "+nums[i]+" :: "+rem);
                break;
            }
        }
        sc.close();
    }
}
