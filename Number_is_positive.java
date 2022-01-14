package JAVA_Practice;

import java.util.Scanner;

public class Number_is_positive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if(n>0){
            System.out.println("Number is positive");
        }else{
            System.out.println("Number is negative");
        }
    }
}
