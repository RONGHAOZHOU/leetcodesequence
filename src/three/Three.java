package three;

import java.util.HashSet;
import java.util.Set;

public class Three {
    public static void main(String[] args) {
        String abcabcbb = "abcabcbb";
        String bbbbb = "bbbbb";
        String pwwkew = "pwwkew";

        System.out.println(lengthOfLongestSubstring(abcabcbb));
        System.out.println(lengthOfLongestSubstring(bbbbb));
        System.out.println(lengthOfLongestSubstring(pwwkew));

    }

    //暴力解
    private static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int max =0;

        for (int i = 0; i < n; i++) {
            for (int j=i; j < n; j++) {
                //遍历所有字串，判断是否有重复字母
                boolean repeat = false;
                Set<Character> set = new HashSet<>(); //集合用于判断是否重复
                //便利字符串的每一个字母
                for (int k = i; k <= j; k++) {
                    char ch = s.charAt(k);
                    if (set.contains(ch)) {
                        repeat = true;
                        break;
                    }
                    set.add(ch);
                }
                if (!repeat) max = Math.max(j - i+1, max);
            }
        }
        return max;
    }
}
