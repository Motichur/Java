package JAVA_Practice;

public class add_two_matrix {
    public static void main(String[] args) {
        int r =2,c=3;
        int[][] arr1 = {{1,2,3},{4,5,6}};
        int[][] arr2 = {{1,2,3},{4,5,6}};
        int[][] arr3 = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c ;j++){
                arr3[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(arr3[i][j] +" ");
            }
        }
    }
}
