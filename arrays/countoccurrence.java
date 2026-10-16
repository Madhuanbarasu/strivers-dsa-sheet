import java.util.Scanner;

public class countoccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int first = -1;
        int last = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        int count=0;
        if(first!=-1){
            count=last-first+1;
        }
        System.out.println(count);
    }
}
