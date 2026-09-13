
import java.util.Scanner;
import java.util.ArrayList;

public class spiralmatrix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] matrix = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        ArrayList<Integer>l=new ArrayList<>();
        int top=0;
        int left=0;
        int right=matrix[0].length-1;
        int bottom= matrix.length-1;
        while(top<=bottom && left<=right) {
            for (int i = left; i <= right; i++) {
                l.add(matrix[top][i]);

            }
            top++;
            for (int i = top; i <=bottom;i++){
                l.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    l.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    l.add(matrix[i][left]);
                }
                left++;
            }

        }
        System.out.println(l);
    }
}
