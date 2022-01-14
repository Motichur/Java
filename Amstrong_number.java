package JAVA_Practice;

import java.util.Scanner;

public class Amstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int rev = a;
        int result =0;
        while(a != 0){
            int k = a%10;
            result += Math.pow(k,3);
            a /=10;
        }
        if(result == rev){
            System.out.println("Number is Amstrong");
        }
    }
}
