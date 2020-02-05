package nine;

public class Nine {
    public static void main(String[] args) {
        int a=121;
        int b = -121;
        int c =10;
        System.out.println(isPalindrome(a));
        System.out.println(isPalindrome(b));
        System.out.println(isPalindrome(c));
    }

    private static boolean isPalindrome(int a) {
        String origin = Integer.toString(a);
        StringBuilder stringBuilder = new StringBuilder(origin);
        return stringBuilder.reverse().toString().equals(origin);
    }
}
