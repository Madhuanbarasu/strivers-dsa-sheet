import java.util.HashSet;
import java.util.Scanner;
public class union {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int [] arr1=new int[N];
        for(int i=0;i<N;i++){
            arr1[i]=sc.nextInt();
        }
        int n2=sc.nextInt();
        int [] arr2=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<N;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<n2;i++){
            set.add(arr2[i]);
        }
        System.out.print(set);

    }
}
