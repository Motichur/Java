package JAVA_Practice;

import java.util.Scanner;

public class factorial {
    static  int Fact(int n){
        if(n == 0){
            return 1;
        }
        return n*Fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        System.out.println("Factorial of "+n+" is "+Fact(n));
    }
}
