import java.util.*;
public class twosum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[]res=new int[2];
        for(int i=0;i<n;i++){
            for(int j=1;i<n;j++){

                if(arr[i]+arr[j]==target) {
                    System.out.print(i +" "+ j);
                    return;
                }
            }
        }

    }
}
