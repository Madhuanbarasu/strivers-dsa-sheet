import java.util.*;


public class leaders {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        ArrayList<Integer> leaders = new ArrayList<>();
        int max = nums[n - 1];
        leaders.add(max);
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] > max) {
                leaders.add(nums[i]);
                max = nums[i];
            }

        }
        Collections.reverse(leaders);
        System.out.print(leaders);

    }
}