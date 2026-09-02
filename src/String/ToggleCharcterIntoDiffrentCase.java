package src.String;

import java.util.Scanner;

public class ToggleCharcterIntoDiffrentCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = sc.nextLine();
        String ans = new String();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int asci = (int)ch;
            if(asci>=97){
                asci-=32;
                ans+=(char)asci;
            }
            else{
                asci+=32;
                ans+=(char)asci;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
