package JAVA_Practice;

import java.util.Scanner;

public class Factors_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i =1;i<1000;i++){
            if(a%i==0){
                System.out.print(i+", ");
            }
        }
    }
}
