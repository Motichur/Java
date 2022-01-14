package JAVA_Practice.Arrays;

public class even_pos {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        for(int i=1;i<=arr.length;i++){
            if(i%2==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
