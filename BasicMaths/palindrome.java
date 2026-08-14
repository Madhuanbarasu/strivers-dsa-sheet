import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int org = num;
        int rev = 0;
        while (num > 0) {
            int dig = num % 10;
            rev = (rev * 10) + dig;
            num = num / 10;
        }
        if (org== rev) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}



