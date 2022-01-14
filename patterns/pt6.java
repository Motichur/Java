package JAVA_Practice.patterns;

public class pt6 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0;i < n;i++)
        {
            for(int j = 0;j < n;j++)
            {
                if( i + j ==(n-1)/2 || i - j == (n-1)/2 || i + j == (n+1) || j - i == (n-1)/2)
                {
                    System.out.print("*" + " ");
                }
                else
                {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}
