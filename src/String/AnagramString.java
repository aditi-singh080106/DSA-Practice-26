package src.String;

import java.util.HashMap;
import java.util.Scanner;

public class AnagramString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str1 = sc.nextLine();
        System.out.println("Enter another string:");
        String str2 = sc.nextLine();
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        if(str1.length() != str2.length()){
            System.out.println("Strgs are not anagram..!");
        }else{
            for(int i=0;i<str1.length();i++){
                char ch = str1.charAt(i);
                if(map1.containsKey(ch)){
                    int freq = map1.get(ch);
                    map1.put(ch,freq+1);
                }else{
                    map1.put(ch,1);
                }
            }
            for(int i=0;i<str2.length();i++){
                char ch = str2.charAt(i);
                if(map2.containsKey(ch)){
                    int freq = map2.get(ch);
                    map2.put(ch,freq+1);
                }else{
                    map2.put(ch,1);
                }
            }
            boolean flag = true;
            for(int i=0;i<str1.length();i++){
                char ch = str1.charAt(i);
                if(map1.get(ch)!=map2.get(ch)){
                    System.out.println("Strings are not anagram..!");
                    flag = false;
                    break;
                }else continue;
            }
            if(flag){
                System.out.println("Strings are anagram..!");
            }
        }
        sc.close();
    }
}
