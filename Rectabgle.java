package JAVA_Practice;

import java.util.Scanner;

public class Rectabgle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float l = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println("Perimeter of Rectangle is "+2*(l+b));
    }
}
