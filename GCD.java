package JAVA_Practice;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd=1;
        for (int i = 2;i<1000;i++){
            if(a%i==0 && b%i==0){
                gcd = i;
                //break;
            }
        }
        System.out.println(gcd);
    }
}
