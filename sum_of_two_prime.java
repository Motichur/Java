package JAVA_Practice;

import java.util.Scanner;

public class sum_of_two_prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=2;i<a/2;i++){
            if(prime(i)){
                if(prime(i-1)){
                    System.out.println(a+" = "+i+" + "+(a-i));
                }
            }
        }
    }
    public static boolean prime(int a){
        for(int i=2;i<a/2;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
}
