package sixseven;

public class SixSeven {

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        String c = "1010";
        String d = "1011";


        System.out.println(addBinary(a, b));
        System.out.println(addBinary(c, d));
//        addBinary(a, b);

    }


    //Java 中char转int的方法 1.Character.getNumericValue(ch)   2.ch-'0'   否则得到的是ASCII码





    public static String addBinary(String a, String b) {

        int p = a.length() - 1;
        int q = b.length() - 1;

        StringBuilder result = new StringBuilder();
        int x, y, sum, carry = 0;
//        if (l1 ==-1||l2==-1) return l1 == -1 ? b : a;//判空
        while (p >= 0 || q >= 0) {
            x = p < 0 ? 0 : Character.getNumericValue(a.charAt(p--));
            y = q < 0 ? 0 : Character.getNumericValue(b.charAt(q--));
            sum = x + y + carry;
            carry = sum / 2;
            result.insert(0, sum % 2);
        }
        return carry == 1 ? result.insert(0, 1).toString() : result.toString();
    }
}



//class Solution {
//    public String addBinary(String a, String b) {
//        StringBuilder ans = new StringBuilder();
//        int ca = 0;
//        for(int i = a.length() - 1, j = b.length() - 1;i >= 0 || j >= 0; i--, j--) {
//            int sum = ca;
//            sum += i >= 0 ? a.charAt(i) - '0' : 0;
//            sum += j >= 0 ? b.charAt(j) - '0' : 0;
//            ans.append(sum % 2);
//            ca = sum / 2;
//        }
//        ans.append(ca == 1 ? ca : "");
//        return ans.reverse().toString();
//    }
//}
