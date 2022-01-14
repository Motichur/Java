package JAVA_Practice.Arrays;

public class odd_even {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println("Even no are "+arr[i]);
            }
            else{
                System.out.println("Odd no are "+arr[i]);
            }
        }
    }
}
