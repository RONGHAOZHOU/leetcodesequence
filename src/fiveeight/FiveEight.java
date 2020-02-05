package fiveeight;

public class FiveEight {
    public static void main(String[] args) {
        String s = "Hello world";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        String[] strings = s.trim().split(" ");
        return strings.length==0?0:strings[strings.length - 1].length();
    }
}
