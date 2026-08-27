import java.util.Scanner;
public class singlenum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result=0;
        for(int num:arr){
            result=result^num;
        }
        System.out.print(result);
    }
}
