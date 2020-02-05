package sevenzero;

public class SevenZero2 {
    //答案其实是一个斐波那契数列
    public int climbStairs(int n) {
        double d = Math.sqrt(5);
        n = n + 1;
        return (int) ((Math.pow((1 + d) / 2, n) - Math.pow((1 - d) / 2, n)) / d + 0.5);
    }

}
