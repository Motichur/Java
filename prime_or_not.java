package JAVA_Practice;

import java.util.Scanner;

public class prime_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=2;i<a;++i){
            if(a%i!=0){
                System.out.println("Not Prime");
                break;
            }
        }
    }
}
