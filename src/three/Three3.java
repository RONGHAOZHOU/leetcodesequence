package three;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Three3 {
    public static void main(String[] args) {
        String abcabcbb = "abcabcbb";
        String bbbbb = "bbbbb";
        String pwwkew = "pwwkew";

        System.out.println(lengthOfLongestSubstring(abcabcbb));
        System.out.println(lengthOfLongestSubstring(bbbbb));
        System.out.println(lengthOfLongestSubstring(pwwkew));
    }

    //滑动窗口法 (相比较于2的优化，i不再是逐一递增，而是使用Map快速跳动)
    private static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int i = 0, j = 0, ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (i = 0, j = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);//防止i向左移动，例如：ab……ba，当j到a的位置时，i会左移
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }
}
