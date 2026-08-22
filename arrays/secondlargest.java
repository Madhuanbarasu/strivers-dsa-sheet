
import java.util.Scanner;
public class secondlargest {
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int [] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int largest=arr[0];
        int seclarge=Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            if(arr[i]>largest)
                largest=arr[i];
        }
        for(int i=0;i<N;i++){
            if(arr[i]!=largest && arr[i]>seclarge){
                seclarge=arr[i];
            }
        }
        System.out.print(seclarge);
    }
}
