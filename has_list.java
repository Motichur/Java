package JAVA_Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class has_list {
    public static void main(String[] args) {
        Map<String,Integer> h = new HashMap<String,Integer>();
        h.put("Kunal",1);
        h.put("Thakare",2);

        List<Integer> key = new ArrayList(h.keySet());
        List<Integer> val = new ArrayList<>(h.values());
        System.out.println(key);
        System.out.println(val);
    }
}
