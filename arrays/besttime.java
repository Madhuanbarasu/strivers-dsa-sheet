import java.util.Scanner;

public class besttime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int min = nums[0];
        int profit = 0;

        for (int i = 1; i < n; i++) {

            if (nums[i] - min > profit) {
                profit = nums[i] - min;
            }

            if (nums[i] < min) {
                min = nums[i];
            }
        }

        System.out.println(profit);
    }
}