package JAVA_Practice;

public class vow_const {
    public static void main(String[] args) {
        String str = "Kunal Thakare";
        int vow=0,cont=0;
        for(int  i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                vow++;
            }
            else{
                cont++;
            }
        }
        System.out.println(vow);
        System.out.println(cont);
    }
}
