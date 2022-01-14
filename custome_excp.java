package JAVA_Practice;


import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.Arrays;

class Myexception extends Exception{
    public Myexception (String s){
        System.out.println("Error....! ");
    }
}

public class custome_excp {
    public ArrayList<String> a = new ArrayList<>(Arrays.asList("Hello", "ok", "Buy"));
    public void exception(String a1) throws Myexception{
        if(a.contains(a1)){
            throw new Myexception(a1 + "already Exists");
        }else
        {
            a.add(a1);
            System.out.println(a1+" Is added");
        }
    }

    public static void main(String[] args) {
        custome_excp m = new custome_excp();
        try{
            m.exception("ok");
            m.exception("Bye");
        }
        catch (Myexception e){
            System.out.println("exception");
        }
    }
}
