package JAVA_Practice;

public enum size {
    Kunal,thakare;
    public String getname(){
        switch (this){
            case Kunal:
                return "Kunal";
            case thakare:
                return "thakare";
            default:
                return null;
        }
    }
    public static void main(String[] args) {
        System.out.println(size.Kunal.getname());
        System.out.println(size.thakare.getname());
    }
}
