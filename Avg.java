package JAVA_Practice;

import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Numbers");
        int a = sc.nextByte();
        int b = sc.nextByte();
        int c = sc.nextByte();
        int avg ;
        avg = (a+b+c)/3;
        System.out.println(avg);
    }
}
