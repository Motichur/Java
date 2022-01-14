package JAVA_Practice;

import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        System.out.println("Area Of Circle "+Math.PI*radius*radius);
        System.out.println("Perimeter of Circle "+2*Math.PI*radius);
    }
}
