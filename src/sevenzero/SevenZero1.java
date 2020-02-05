package sevenzero;

public class SevenZero1 {
    public int climbStairs(int n) {
        // 1 直接递归，很多重复计算，超时
        if (n <= 2) {
            return n;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}
