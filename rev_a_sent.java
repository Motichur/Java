package JAVA_Practice;

public class rev_a_sent {
    public static String rev(String s){
        if(s.isEmpty()){
            return s;
        }

            return rev(s.substring(1))+s.charAt(0);

    }
    public static void main(String[] args) {
        String str = "kunal";
        System.out.println(rev(str));
    }
}
