package three;

import java.util.HashSet;
import java.util.Set;

public class Three2 {
    public static void main(String[] args) {
        String abcabcbb = "abcabcbb";
        String bbbbb = "bbbbb";
        String pwwkew = "pwwkew";

        System.out.println(lengthOfLongestSubstring(abcabcbb));
        System.out.println(lengthOfLongestSubstring(bbbbb));
        System.out.println(lengthOfLongestSubstring(pwwkew));
    }

    //滑动窗口法
    private static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int i = 0, j = 0, ans = 0;
        Set<Character> set = new HashSet<>(); //集合用于去重

        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))) {//没有包含第j个字符，j往后移，窗口长度变大，和最大值比较
                set.add(s.charAt(j++));
                ans = Math.max(j - i, ans);
            } else {//有重复字符时，从窗口的前端移出不断移出字符，直到无重复
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}
