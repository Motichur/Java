package JAVA_Practice.Arrays;

import java.util.Arrays;

public class largest_no {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int larg;
        int l = arr.length;
        larg = arr[0];
        for(int i=0;i<l;i++){
            if(arr[i]>larg){
                larg = arr[i];
            }
        }
        System.out.println(larg);
        System.out.println(arr[l-2]);
        Arrays.sort(arr);
        System.out.println(arr[l-3]);
    }
}
