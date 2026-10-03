import java.util.*;
public class lowerbound {
    static int lowerBound(int[] arr, int n, int x) {
        int low = 0;
        int high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Maybe an answer
            if (arr[mid] >= x) {
                ans = mid;

                // Look for a smaller index on the left
                high = mid - 1;
            } else {
                // Look on the right
                low = mid + 1;
            }
        }

        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(lowerBound(arr, n, x));
    }
}
