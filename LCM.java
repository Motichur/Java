package JAVA_Practice;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int LCM = 1;
        while(a > 1 && b > 1){
            LCM = (a%10)*(b%10);
            a = a/10;
            b = b/10;
        }
        System.out.println(LCM);
    }
}
