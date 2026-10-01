import java.util.*;
public class bsonsorted {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int target=sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                return;
            } else if (target>arr[mid]) {
                low=mid+1;
                
            }
            else{
                high=mid-1;
            }
        }
        System.out.println(-1);
    }
}
