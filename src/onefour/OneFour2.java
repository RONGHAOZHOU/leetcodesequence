package onefour;

public class OneFour2 {
    public static void main(String[] args) {
        String[] strings = new String[]{"abcd", "abc", "ab"};
//        System.out.println("abc".substring(0,1));
        System.out.println(longestCommonPrefix(strings));

    }

    private static String longestCommonPrefix(String[] strings) {
        if (strings==null||strings.length==0) return "";
        int n = strings[0].length();
        for (int i = 0; i < n; i++) {
            char c = strings[0].charAt(i);
            for (int j = 1; j < strings.length; j++) {
                if (i == strings[j].length() || strings[j].charAt(i) != c) {
                    return strings[0].substring(0, i);
                }
            }
        }
        return strings[0];
    }
}
