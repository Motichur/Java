package JAVA_Practice.String;

public class numeric_string {
    public static void main(String[] args) {
        String str = "kunal";
        boolean num = true;
        try {
            int numeric = Integer.parseInt(str);
        }
        catch (Exception e)
        {
            num = false;
        }
        if(num){
            System.out.println("String is numeric");
        }
        else{
            System.out.println("String Is not Numeric");
        }
    }
}
