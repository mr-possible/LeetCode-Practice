import java.util.Arrays;

public class Problem1929 {
    // Problem Link: https://leetcode.com/problems/concatenation-of-array/description/

    public static void main(String[] args) {
        int[] ans = Problem1929.concatenationOfArray(new int[]{1, 2, 3});
        System.out.println(Arrays.toString(ans));
    }

    static int[] concatenationOfArray(int[] nums) {
        int[] ans = new int[2 * (nums.length)];
        for (int i = 0; i < ans.length; i++) {
            if (i >= nums.length) {
                // Special Case
                ans[i] = nums[i - nums.length];
            } else {
                //Standard Case
                ans[i] = nums[i];
            }
        }
        return ans;
    }
}
