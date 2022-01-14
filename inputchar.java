package JAVA_Practice;
// Check Whether input char is vowel or constant

import java.util.Scanner;

public class inputchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character");
        char ab = sc.nextLine().charAt(0);
        if(ab=='a'||ab=='e'||ab=='i'||ab=='o'||ab=='u'){
            System.out.println("Input character is a Vowel");
        }
        else{
            System.out.println("Input character is a Constant");
        }
    }
}
