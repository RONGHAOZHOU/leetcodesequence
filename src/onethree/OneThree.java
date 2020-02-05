package onethree;

import java.util.HashMap;
import java.util.Map;

public class OneThree {
    public static void main(String[] args) {

        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("LVIII"));
    }

    public static int romanToInt(String s) {

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);


        int result = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                result += map.get(s.charAt(i));
                return result;
            } else {
                int a = map.get(s.charAt(i));
                int b = map.get(s.charAt(i + 1));
                if (a >= b) {
                    result += a;
                }else {
                    result-=a;
                }
            }
        }
        return result;
    }
}
