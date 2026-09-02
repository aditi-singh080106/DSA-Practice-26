package src.String;

import java.util.Scanner;

public class UpdateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.nextLine();
        String s = new String();
        for(int i=0;i<str.length();i++){
            if(i%2==0){
                s+='a';
            }else{
                s= s+str.charAt(i);
            }
        }
        System.out.println(s);
        sc.close();
    }
}
