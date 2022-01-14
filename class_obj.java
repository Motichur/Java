package JAVA_Practice;
class One{

}
class Two{

}

public class class_obj {
    public static void main(String[] args) {
        One o = new One();
        Two t = new Two();
        System.out.println(o.getClass());
        System.out.println(t.getClass());
    }
}
