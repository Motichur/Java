package JAVA_Practice;

import java.util.Scanner;

public class find {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i] = sc.nextInt();
        }
        System.out.println("Enter element to find");
        int e = sc.nextInt();
        for(int i=0;i<n;i++){
            if(ar[i]==e){
                System.out.println("Element is present");
                break;
            }
        }
    }
}
