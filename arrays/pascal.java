import java.util.*;
public class pascal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        List<List<Integer>> ans= new ArrayList<>();
        for(int row =1;row<=n;row++){
            List<Integer> cur = new ArrayList<>();
            long value =1;
            cur.add(1);
            for(int col=1;col<row;col++){
                value =value*(row-col);
                value=value/col;
                cur.add((int)value);
            }
            ans.add(cur);
        }
        System.out.println(ans);
    }
}
