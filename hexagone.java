package JAVA_Practice;

import java.util.Scanner;

import static java.lang.Math.tan;

public class hexagone {
    static float pologon_area(float n, float s){
        float result;
        result = (float) ((n*s*s)/(4*tan(Math.PI/n)));
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        float result = (float) ((6 * a*a)/(4*tan(Math.PI/6)));
//        System.out.println(result);
        float n = sc.nextFloat();
        float s = sc.nextFloat();
        System.out.println(pologon_area(n,s));
    }
}
