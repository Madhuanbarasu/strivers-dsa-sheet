import java .util.Scanner;
public class Factorial {
    public int fact(int i){
        if(i==0) {
            return 1;
        }
        return i*fact(i-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        Factorial obj=new Factorial();
        System.out.print(obj.fact(N));

    }

}
