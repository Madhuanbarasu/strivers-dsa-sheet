import java.util.Scanner;

public class Sum {
    public int sum(int i){
       if(i==0) return 0;
       return i+ sum(i-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        Sum obj= new Sum();
        System.out.print(obj.sum(N));

    }

}
