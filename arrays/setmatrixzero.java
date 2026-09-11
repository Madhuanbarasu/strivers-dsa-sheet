import java.util.*;
public class setmatrixzero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    markrow(mat,i);
                    markcol(mat,j);
                }

            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == -1) {
                    mat[i][j] = 0;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
        public static void markrow(int[][] mat,int i){
            int n = mat[0].length;
            for(int j=0;j<n;j++){
                if(mat[i][j]!=0){
                    mat[i][j]=-1;
                }

            }
        }
        public static void markcol(int [][] mat,int j){
            int m = mat.length;
            for(int i=0;i<m;i++){
                if(mat[i][j]!=0){
                    mat[i][j]=-1;
                }

            }
        }



}
