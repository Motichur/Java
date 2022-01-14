package JAVA_Practice.Arrays;

public class sum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int total =0;
        for(int i=0;i<arr.length;i++){
            total += arr[i];
        }
        System.out.println(total);
    }
}
