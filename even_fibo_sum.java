package JAVA_Practice;

public class even_fibo_sum {
    public static void main(String[] args) {
        long n = 4000000;
        long num1 = 1, num2 = 2;
        long counter = 0;
        long sum = 0;
        while(counter < n){
            //System.out.print(num1+", ");
            if(num1 % 2 == 0){
                sum+= num1;
            }
            long num3 = num1+num2;
            num1 = num2;
            num2 = num3;
            counter++;
        }
        System.out.println();
        System.out.print(sum);
    }
}
