import java.util.*;
public class removeduplicates {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        int [] arr=new int[N];

        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int i=0;
        int j=1;
        while(j<arr.length){
            if(arr[i]==arr[j]){
                j++;
            }
            else{
                i++;
                arr[i]=arr[j];
                j++;
            }
        }
        System.out.println(i+1);
        for(int k=0;k<=i;k++){
            System.out.print(arr[k]+" ");
        }


    }
    
}
