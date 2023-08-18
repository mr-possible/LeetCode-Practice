import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem1365 {
    //Problem Link: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

    public static void main(String[] args) {
        int[] ans = Problem1365.countSmallerThanEachElement(new int[]{8, 1, 2, 2, 3});
        System.out.println(Arrays.toString(ans));
    }

    static int[] countSmallerThanEachElement(int[] nums) {
        int[] ans = nums.clone(); // [8,1,2,2,3]
        Map<Integer, Integer> myMap = new HashMap<>();

        Arrays.sort(ans); // [1,2,2,3,8]

        for (int i = 0; i < ans.length; i++) {
            myMap.putIfAbsent(ans[i], i); // {1:0, 2:1, 3:3, 8:4}
        }

        for (int i = 0; i < nums.length; i++) {
            ans[i] = myMap.get(nums[i]);  // [4, 0, 1, 1, 3]
        }
        return ans;
    }
}
