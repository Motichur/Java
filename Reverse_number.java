package JAVA_Practice;

import java.util.Scanner;

public class Reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int reverse=0;
        while(a>0){
            int k = a%10;
            reverse = reverse*10 + k;
            a = a/10;
        }
        System.out.println(reverse);
    }
}
