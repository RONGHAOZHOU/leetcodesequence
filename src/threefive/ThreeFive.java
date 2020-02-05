package threefive;

public class ThreeFive {
    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 5, 6};
        System.out.println(searchInsert(a, 5));


    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
