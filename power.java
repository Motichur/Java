package JAVA_Practice;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number and its power");
        int n = sc.nextInt();
        int p = sc.nextInt();
        int result = 1;
        for(int i =p;i>0;--i){
            result *= n;
        }
        System.out.println(result);
    }
}
