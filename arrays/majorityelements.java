import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class majorityelements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(ans.contains(arr[i])){
                continue;
            }
            int count=0;
            for(int j=0;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>arr.length/3){
                ans.add(arr[i]);
            }

        }
        System.out.println(ans);

    }
}
