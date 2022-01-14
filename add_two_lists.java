package JAVA_Practice;

import java.util.ArrayList;
import java.util.List;

public class add_two_lists {
    public static void main(String[] args) {
        List <String> l1 = new ArrayList<>();
        l1.add("Kunal");
        List<String> l2 = new ArrayList<>();
        l2.add("Thakare");
        List<String> result = new ArrayList<>();
        result.addAll(l1);
        result.addAll(l2);
        System.out.println(result);
    }
}
