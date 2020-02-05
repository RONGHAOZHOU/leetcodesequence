package threefive;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 5, 6};
        System.out.println(search(a, 0,a.length-1,5));
    }

    public static int search(int[] nums, int left, int right, int target) {
        if (left>right) return -1;
        int mid = left + (right - left) / 2;
        if (nums[mid] == target) return mid;
        if (nums[mid] < target) return search(nums, mid + 1, right, target);
        else return search(nums, left, right - 1, target);
    }
}
