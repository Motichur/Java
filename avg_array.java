package JAVA_Practice;

import java.util.Scanner;

public class avg_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int sum =0;
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        int avg ;
        avg = sum/arr.length;
        System.out.println(avg);
    }
}
