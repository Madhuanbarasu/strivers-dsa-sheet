import java.util.Scanner;
public class PrintNto1 {
    public void print(int i,int N){
        if(i<1) return;
        System.out.println(i);
        print(i-1,N);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        PrintNto1 obj=new PrintNto1();
        obj.print(N,N);

    }
}
