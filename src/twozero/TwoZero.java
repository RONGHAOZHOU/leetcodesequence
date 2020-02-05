package twozero;

import java.util.*;

public class TwoZero {

    public static void main(String[] args) {
        String a = "()";
        String b = "()[]{}";
        String c = "(]";

        System.out.println(isValid(a));
        System.out.println(isValid(b));
        System.out.println(isValid(c));
    }



    public static boolean isValid(String s) {
        if (s.length() == 0) return true;
        if (s.length() % 2 == 1) return false;
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                stack.push(map.get(s.charAt(i)));
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char c = stack.pop();
                if (c!=s.charAt(i)) return false;
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}
