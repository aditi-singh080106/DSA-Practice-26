package src.String;

import java.util.HashMap;
import java.util.Scanner;

public class Isomorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str1 = sc.nextLine();
        System.out.println("Enter another string:");
        String str2 = sc.nextLine();
        HashMap<Character,Character> map1 = new HashMap<>();
        HashMap<Character,Character> map2 = new HashMap<>();
        if(str1.length()!=str2.length()){
            System.out.println("Strings are not isomorphic..!");
        }
        else{
            int n = str1.length();
            boolean flag = true;
            for(int i=0;i<n;i++){
                char ch1 = str1.charAt(i);
                char ch2 = str2.charAt(i);
                if(map1.containsKey(ch1)){
                    if(map1.get(ch1)!=ch2){
                        flag=false;
                        break;
                    }
                } 
                else map1.put(ch1,ch2);                                  
                if(map2.containsKey(ch2)){
                    if(map2.get(ch2)!=ch1){
                        flag=false;
                        break;
                    }
                }
                else map2.put(ch2,ch1);
            }
            if(flag){
                System.out.println("Strings are isomorphic..!");
            }
            else{
                System.out.println("String is not Isomorphic..!");
            }
        }
        sc.close();
    }
}
