import java.util.*;
public class XORSubarray {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int k=sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int xr=0;
        HashMap<Integer,Integer> map =new HashMap<>();
        map.put(0,1);
        int count =0;
        for(int i=0;i<n;i++){
            xr=xr^arr[i];
            int x=xr^k;
            count+=map.getOrDefault(x,0);
            map.put(xr,map.getOrDefault(xr,0)+1);

        }
        System.out.println(count);
    }
}
