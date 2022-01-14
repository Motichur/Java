package JAVA_Practice;

public class transpose_matrix {
    public static void main(String[] args) {
        int r=2,c=3;
        int[][] arr = {{1,2,3},{4,5,6}};
        int[][] arr1 = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr1[j][i]=arr[i][j];
            }
        }
        for(int[] r1 : arr){
            for(int c1 :r1){
                System.out.println(c1+" ");
            }
        }
    }
}
