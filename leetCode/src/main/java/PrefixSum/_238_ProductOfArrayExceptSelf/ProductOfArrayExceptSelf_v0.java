package PrefixSum._238_ProductOfArrayExceptSelf;

public class ProductOfArrayExceptSelf_v0 {
    public static int[] productExceptSelf1(int[] nums) {
        int n = nums.length;
        if (nums == null || n == 0) return new int[]{};

        int[] left = new int[n];
        int[] right = new int[n];
        int[] res = new int[n];
        left[0] = 1;
        right[n - 1] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < n; i++) {
            res[i] = left[i] * right[i];
        }
        return res;
    }
}
