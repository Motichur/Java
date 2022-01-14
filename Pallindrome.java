package JAVA_Practice;

import java.util.Scanner;

public class Pallindrome {
    static String reverse(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return "False";
            }
        }
        return "True";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        System.out.println(reverse(s));
    }
}
