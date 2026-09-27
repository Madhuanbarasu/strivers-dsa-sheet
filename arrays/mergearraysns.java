import java.util.*;

public class mergearraysns {

    static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {

            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }

            k--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter m: ");
        int m = sc.nextInt();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] nums1 = new int[m + n];

        System.out.println("Enter nums1 elements:");
        for (int i = 0; i < m + n; i++) {
            nums1[i] = sc.nextInt();
        }

        int[] nums2 = new int[n];

        System.out.println("Enter nums2 elements:");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        merge(nums1, m, nums2, n);

        System.out.println("Merged array: " + Arrays.toString(nums1));

        sc.close();
    }
}