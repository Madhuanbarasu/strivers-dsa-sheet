
import java.util.*;
public class rearrange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int [] pos =new int[n/2];
        int[] neg =new int[n/2];
        int p=0;
        int ne=0;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                pos[p]=nums[i];
                p++;
            }
            else{
                neg[ne]=nums[i];
                ne++;
            }
        }
        for(int i=0;i<n/2;i++){
            nums[2*i]=pos[i];
            nums[2*i+1]=neg[i];
        }
        for (int i = 0; i <n; i++) {
            System.out.print(nums[i]+" ");
        }

    }
}
