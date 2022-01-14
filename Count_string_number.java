package JAVA_Practice;

import java.util.Scanner;

public class Count_string_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [] ch = sc.nextLine().toCharArray();
        int letter=0;
        int digit=0;
        int sym=0;
        int space=0;
        for(int i =0;i<ch.length;i++){
            if(Character.isLetter(ch[i])){
                letter++;
            }
            else if(Character.isSpace(ch[i])){
                space++;
            }
            else if(Character.isDigit(ch[i])){
                digit ++;
            }
            else{
                sym++;
            }
        }
        System.out.println(letter);
        System.out.println(space);
        System.out.println(digit);
        System.out.println(sym);
    }
}
