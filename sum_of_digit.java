package JAVA_Practice;

import java.util.Scanner;

public class sum_of_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int r=0;
        while (a != 0){
            r = a %10 + r;
            a = a/10;
        }
        System.out.println(r);
    }
}
