package JAVA_Practice;

import java.util.Scanner;

public class gcd_recursion {
    public static int gcd(int n1, int n2){
        if(n2 != 0){
            return gcd(n2,n1%n2);
        }else {
            return n1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a,b));
    }
}
