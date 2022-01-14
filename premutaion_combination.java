package JAVA_Practice;

import java.util.Scanner;

public class premutaion_combination {
    static int Return(String s){
        char [] str = s.toCharArray();
        int count=0;
        for(int i=0;i<str.length;i++){
            for(int j=i+1;j<str.length;j++) {
                for(int k=j+1;k<str.length;k++) {
                    if (str[i] == str[j] && str[k] == str[i]) {
                        count++;
                        System.out.print(count+" ");
                        break;
                    }
                }
            }
            if(count%2==0){
                return 0;
            }
        }
        count = count - count%2;
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String s = sc.nextLine();
        System.out.println(Return(s));
        System.out.println(Return(s));
    }
}
