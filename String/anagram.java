package JAVA_Practice.String;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String str  = "Care";
        String str1 = "Race";
        str = str.toLowerCase();
        str1 = str1.toLowerCase();

        char[] ch  = str.toCharArray();
        char[] ch1 = str1.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch1);

        boolean result = Arrays.equals(ch, ch1);

        if(result){
            System.out.println("String are Anagram");
        }else{
            System.out.println("String are Not Anagram");
        }
    }
}
