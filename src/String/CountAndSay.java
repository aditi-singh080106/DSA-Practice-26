package src.String;

import java.util.HashMap;
import java.util.Scanner;

public class CountAndSay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char key = str.charAt(i);
            if(map.containsKey(key)){
                int freq=map.get(key);
                map.put(key, freq+1);
            }
            else map.put(key,1);
        }
        String ans = new String();
        for(char key : map.keySet()){
            ans+=key;
            ans+=map.get(key);
        }
        System.out.println(ans);
        sc.close();
    }
}
