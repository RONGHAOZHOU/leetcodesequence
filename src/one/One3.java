package one;

import java.util.HashMap;
import java.util.Map;

public class One3 {

    public static void main(String[] args) {
        One2 solution = new One2();
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        for (int i : result) {
            System.out.println(i);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
