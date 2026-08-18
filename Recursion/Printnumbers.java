import java.util.Scanner;

public class Printnumbers {
    public void print(int i,int N){

        if(i>N) return;
        System.out.println(i);
        print(i+1,N);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        Printnumbers obj=new Printnumbers();
        obj.print(1, N);
    }
}
