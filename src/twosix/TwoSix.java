package twosix;

public class TwoSix {
    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,2,2,3,3,4};

        removeElement(nums,2);
        for (int num : nums) {
            System.out.println(num);
        }

    }
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i++] = nums[j];
            }
        }
        return i;
    }

}
