package JAVA_Practice;

class Base1{
    int i,j;
    private Base1(int i, int j){
        this.i = i;
        this.j = j;
        System.out.println("This is Base Constructor");
    }
    public static void test(){
        Base1 b = new Base1(1,2);
    }
}
class Der {
    Der(int i, int j, int k){
        //super(i,j);
        System.out.println("this is Derived Constructor");
    }
}

public class constr {
    public static void main(String[] args) {
        //Der d = new Der(1,2,3);
        Base1.test();
    }
}
