package JAVA_Practice.Arrays;

public class small_no {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int smal;
        smal = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smal){
                smal = arr[i];
            }
        }
        System.out.println(smal);
    }
}
