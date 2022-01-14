package JAVA_Practice;

import java.util.Scanner;

public class Fibbonachi {
    static int Fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return Fib(n-1)+Fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        System.out.println("Fib series up to "+n+" is "+Fib(n));
    }
}
