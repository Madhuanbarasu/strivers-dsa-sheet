import java.util.Scanner;
public class sorted {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int [] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<N;i++){
            if(arr[i]<arr[i-1]){
                System.out.print("false");
                return;
            }

        }
        System.out.print("false");
    }
}
