import java.util.*;
public class rotatearray {
    public static void reverse(int[] arr,int l,int r){
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;

        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int [] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        k=k%N;
        reverse(arr,0,N-1);
        reverse(arr,0,k-1);
        reverse(arr,k,N-1);
        for(int i=0;i<N;i++){
            System.out.print(arr[i]+" ");

        }

    }
}
