package src.String;

import java.util.Scanner;

public class MaximumNuymberFromAString {
    public static String purify(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='0') return str.substring(i);
        }
        return str;
    }
    public static String maxString(String a , String b){
        String s = purify(a);
        String t = purify(b);
        if(s.length()>t.length()) return s;
        else if(t.length()>s.length()) return t;
        else {
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!=t.charAt(i)){
                    if(s.charAt(i)>t.charAt(i)) return s;
                    else return t;
                }
            }
        }
        if(a.length()>=b.length()) return a;
        else return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter String:");
        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLine();
        }
        String max = new String();
        for(int i=0;i<n;i++){
            max = maxString(max, arr[i]);
        }
        
        System.out.println("Maximum string value:"+max);
        sc.close();
    }
}
