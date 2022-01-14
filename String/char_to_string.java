package JAVA_Practice.String;

import java.util.Scanner;

public class char_to_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        char[] s = {'K', 'u', 'n', 'a', 'l'};
        for(int i=0;i<s.length;i++) {
             str = Character.toString(s[i]);
        }
        System.out.println("String is "+str.toString());
    }
}
