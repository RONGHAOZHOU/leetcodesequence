package sixnine;

public class SixNine {
    public static void main(String[] args) {

        System.out.println(mySqrt(4));
        System.out.println(mySqrt(8));
    }

    public static int mySqrt(int x) {
        //        return (int)Math.sqrt(x);
        long a = x;
        while (a * a > x) {
            a = (a + x / a) / 2;
        }
        return (int) a;
    }
}
