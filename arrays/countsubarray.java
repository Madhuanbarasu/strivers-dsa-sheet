import java.util.*;
public class countsubarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int k=sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int ps=0;
        int count=0;
        for(int i=0;i<n;i++){
            ps+=arr[i];
            int r =ps -k;
            count +=map.getOrDefault(r,0);
            map.put(ps,map.getOrDefault(ps,0)+1);
        }
        System.out.println(count);

    }
}
