package JAVA_Practice.Arrays;

public class contains {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int cont =3;
        for(int i=0;i<arr.length;i++){
            if(cont == arr[i]){
                System.out.println("Number is present");
            }
        }
    }
}
