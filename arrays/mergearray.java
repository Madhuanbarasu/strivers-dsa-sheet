import java.util.*;
public class mergearray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();

        }
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        ArrayList<ArrayList<Integer>> ans =new ArrayList<>();
        for(int i=0;i<n;i++){
            int start=arr[i][0];
            int end =arr[i][1];
            if(!ans.isEmpty()&& start<=ans.get(ans.size()-1).get(1)){
                continue;
            }
            for(int j=i+1;j<n;j++){
                if(arr[j][0]<= end){
                    end=Math.max(end,arr[j][1]);
                }
                else{
                    break;
                }
            }
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(start);
            temp.add(end);
            ans.add(temp);

        }
        System.out.println(ans);
    }
}
