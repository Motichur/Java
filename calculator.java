package JAVA_Practice;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.For Addition Please Enter +");
        System.out.println("1.For Subtraction Please Enter -");
        System.out.println("1.For Multiplication Please Enter *");
        System.out.println("1.For Division Please Enter /");
        System.out.println("Enter your Choice");
        char ch = sc.nextLine().charAt(0);
        System.out.println("Enter two Numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        switch(ch){
            case '+' : int c = a+b;
                System.out.println("Addition is : "+c);
                break;
            case '-' : c = a-b;
                System.out.println("Subtraction is : "+c);
                break;
            case '*' : c = a*b;
                System.out.println("Multiplication  is : "+c);
                break;
            case '/' :  c = a/b;
                System.out.println("Division is : "+c);
                break;
            default:break;
        }
    }
}
