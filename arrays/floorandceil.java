import java.util.*;
public class floorandceil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= x) {
                ans = arr[mid];
                low = mid + 1;

            } else {

                high = mid - 1;

            }
        }
        System.out.println("Floor "+ ans);
        int l= 0;
        int h = n - 1;
        int a = -1;
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (arr[m] >= x) {
                a = arr[m];
                h = m - 1;

            } else {

                l= m + 1;

            }
        }
        System.out.println("Ceil "+ a);
    }
}
