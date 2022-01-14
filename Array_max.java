package JAVA_Practice;

import java.util.Scanner;

public class Array_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = arr[0];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
