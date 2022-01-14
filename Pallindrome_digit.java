package JAVA_Practice;

import java.util.Scanner;

public class Pallindrome_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                System.out.println("Not Pallindrome");
                break;
            }
        }
    }
}
