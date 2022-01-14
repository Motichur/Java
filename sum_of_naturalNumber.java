package JAVA_Practice;

import java.util.Scanner;

public class sum_of_naturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        int result=0;
//        for(int i=1;i<=n;i++){
//            result += i;
//        }
        result = (n*(n+1))/2;
        System.out.println(result);
    }
}
