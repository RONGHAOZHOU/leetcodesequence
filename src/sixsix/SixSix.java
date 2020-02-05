package sixsix;

import java.util.Arrays;
import java.util.List;

public class SixSix {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        int[] results = plusOne(nums);
        for (int result : results) {
            System.out.println(result);
        }
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = (digits[i] + 1) % 10;
            if (digits[i]!=0) return digits;
        }
        //如果执行到这里，一定是最高位进位了，结果是10，100，1000，只用管第一位，不用管后面，所以想多了！
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
