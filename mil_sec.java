package JAVA_Practice;

import java.util.Scanner;

public class mil_sec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mil = sc.nextDouble();
        double sec = mil / 1000;
        double min = sec / 60;
        System.out.println(sec);
        System.out.println(min);
    }
}
