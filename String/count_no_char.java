package JAVA_Practice.String;

public class count_no_char {
    public static void main(String[] args) {
        String str = "Kunal thakare ok bye";
        int count =0;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i) != ' '){
                count++;
            }
        }
        System.out.println(count);
        System.out.println(str.length());
    }
}
