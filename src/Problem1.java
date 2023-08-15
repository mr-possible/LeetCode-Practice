import java.util.*;

public class Problem1 {
    // Problem link: https://leetcode.com/problems/two-sum

    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int[] ans = Problem1.twoSum(nums, 6);
        System.out.println("Final Answer: " + Arrays.toString(ans));
    }

    static public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for(int i=0; i<nums.length; i++) {
            int numToFind = target - nums[i]; // 6 - 3 = 3



            if(map.containsKey(numToFind)) { // {3,0} => yes
                result[0] = i; //
                result[1] = map.get(numToFind);
                break;
            }
            map.put(nums[i], i);   // {3, 0}
        }
        return result;
    }
}
