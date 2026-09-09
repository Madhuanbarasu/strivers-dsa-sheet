import  java.util.*;
public class longestconsecutive {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int longest=1;
        for(int i=0;i<n;i++){
            int x=arr[i];
            int count=1;
            while (contains (arr,x+1)){
                x++;
                count++;

            }
            longest=Math.max(count,longest);
        }
        System.out.print(longest);


    }
    public static boolean contains(int[] arr,int target){
        for(int num:arr){
            if(num==target){
                return true;
            }

        }
        return false;
    }
}
