package lab_1;

import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        System.out.println(isPalindrome(s));
    }
    public static String reverseString(String s){
        String str="";

        for(int i=s.length();i>0;i--){
            str+=s.charAt(i-1);
        }
        return str;
    }
    public static boolean isPalindrome(String s){

        if(s.equals(reverseString(s)))
            return true;
        else
            return false;
    }

}
