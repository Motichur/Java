package JAVA_Practice;

import java.util.Scanner;

public class count_digit_in_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count =0;
        while(a != 0){
            int r = a%10;
            a = a/10;
            count++;
        }
        System.out.println(count);
    }
}
