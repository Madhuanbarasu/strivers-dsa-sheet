import java.util.Scanner;
public class Armstrongnum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int org=n;
        while(n>0){
            int digit=n%10;
            sum+=digit*digit*digit;
            n=n/10;
        }
        if(org==sum){
            System.out.println("Armstrong number");

        }
        else{
            System.out.println("Not an Armstrong number");
        }


    }
}
