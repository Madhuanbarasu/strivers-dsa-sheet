import java.util.*;
public class subarraysumzero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        int sum=0;
        for(int i=0;i<n;i++) {
            sum += arr[i];

            if (sum == 0) {
                max = i + 1;
            }
            else{
                if(map.get(sum)!=null){
                    max=max-Math.max(max,i-map.get(sum));
                }
                else{
                    map.put(sum,i);
                }
            }




        }
        System.out.println(max);
    }
}
