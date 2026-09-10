package src.String;

import java.util.HashMap;
import java.util.Scanner;

public class MostOccuringCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = sc.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char key = str.charAt(i);
            if(map.containsKey(key)){
                int freq = map.get(key);
                map.put(key, freq+1);
            }
            else map.put(key,1);
        }
        int max = Integer.MIN_VALUE;
        char ch=' ';
        for(char key : map.keySet()){
            if(map.get(key)>max){
                max=map.get(key);
                ch=key;
            }
        }
        System.out.println(ch);
        sc.close();
    }
}
