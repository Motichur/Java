package JAVA_Practice;

import java.util.Scanner;

public class quient_reminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter divisor");
        int a = sc.nextInt();
        System.out.println("Enter divided");
        int b = sc.nextInt();
        int quiesiont = a/b;
        int reminder = a%b;
        System.out.print(quiesiont+" "+reminder);
    }
}
