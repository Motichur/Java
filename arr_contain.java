package JAVA_Practice;

public class arr_contain {
    public static boolean contain(int[] arr, int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int n = 5;
        System.out.println(contain(arr,n));
    }
}
