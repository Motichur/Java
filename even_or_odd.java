package JAVA_Practice;

import java.util.Scanner;

public class even_or_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println(a+" is Even Number");
        }else{
            System.out.println(a+" is Odd Number");
        }
    }
}
