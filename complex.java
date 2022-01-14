package JAVA_Practice;

public class complex {
    int  r,i;
    complex(int r, int i){
        this.r = r;
        this.i =i;
    }
    public static complex sum(complex c1, complex c2){
        complex c = new complex(0,0);
        c.r = c1.r +c2.r;
        c.i = c1.i + c2.i;
        return c;
    }
    public static void main(String[] args) {
        complex c1 = new complex(2,5);
        complex c2 = new complex(5,2);
        complex c = sum(c1,c2);
        System.out.println(c.r+" + "+c.i+"i");
    }
}
