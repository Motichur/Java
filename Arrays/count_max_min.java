package JAVA_Practice.Arrays;

public class count_max_min {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int base = 45;
        int Abovebase = 0;
        int belowbase = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(base<arr[i])
            {
                Abovebase++;
            }
            else
            {
                belowbase++;
            }
        }
        System.out.println("Above Base "+Abovebase);
        System.out.println("Below Base "+belowbase);
    }
}
