package JAVA_Practice.String;

import java.util.Scanner;

public class Duplicate_in_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String  str = sc.nextLine();
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    System.out.print(str.charAt(j)+" ");
                    break;
                }
            }
        }
    }
}
