package src.String;

import java.util.Scanner;

public class ReverseSentance {
    public static String reverse(String str){
        String ans = new String();
        for(int i=str.length()-1;i>=0;i--){
            ans+=str.charAt(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = sc.nextLine();
        String ans = new String();
        // for(int i=0;i<str.length();i++){
        //     for(int j=i+1;j<str.length();j++){
        //         char ch = str.charAt(j);
        //         if(ch==' '){
        //             System.out.println(str.substring(i,j));
        //             ans+=(' '+reverse(str.substring(i,j-1)));
        //             break;
        //         }
        //     }
        // }
        int i=0,j=0;
        while(j<str.length()){
            if(str.charAt(j)==' '){
                ans+=(reverse(str.substring(i,j))+" ");
                i=j+1;j=i;
            }
            else if(j==str.length()-1){
                ans+=reverse(str.substring(i));
                break;
            }
            else j++;
        }
        System.out.println(ans);
        sc.close();
    }
}
