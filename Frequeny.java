package JAVA_Practice;

public class Frequeny {
    public static void main(String[] args) {
        String str = "Kunal Thakare";
        char c ='a';
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == c){
                count++;
            }
        }
        System.out.println(count);
    }
}
