import java.util.Scanner;

public class PrintNtimes {
    public void name(String name, int N){
        if(N==0) return;
        System.out.println(name);
        N--;
        name(name,N);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        PrintNtimes obj = new PrintNtimes();
        obj.name("Madhu", N);
    }
}
