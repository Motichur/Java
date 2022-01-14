package JAVA_Practice;

import java.util.Scanner;

import static java.lang.Math.*;

public class distance_between_two_points {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double r = 6371.01;
        double d;
        d = r * acos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2));
        System.out.println(d);
    }
}
