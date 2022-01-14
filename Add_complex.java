package JAVA_Practice;

public class Add_complex {
    int r;
    int i;
    Add_complex(int r, int i){
        this.r= r;
        this.i=i;
    }
    public static Add_complex sum(Add_complex c1, Add_complex c2){
        Add_complex c = new Add_complex(0,0);
        c.r = c1.r + c2.r;
        c.i = c1.i + c2.i;
        return c;
    }

    public static void main(String[] args) {
        Add_complex c1 = new Add_complex(5,5);
        Add_complex c2 = new Add_complex(2,2);
        Add_complex temp = sum(c1, c2);
        System.out.println(temp.r+" + "+temp.i+"i");
    }
}
