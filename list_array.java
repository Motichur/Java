package JAVA_Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class list_array {
    public static void main(String[] args) {
//        ArrayList<String> a = new ArrayList<>();
//        a.add("1");
//        a.add("2");
//        a.add("3");
//        a.add("4");
//        a.add("5");
//        String[] arr = new String[a.size()];
//        a.toArray(arr);
//        for(String ele:arr){
//            System.out.print(ele+", ");
//        }
        String[] str = {"Kunal","Thakare"};
        ArrayList <String> str1 = new ArrayList<>(Arrays.asList(str));
        System.out.println(str1);
    }
}
