package seven;

public class Seven {
    public static void main(String[] args) {
        int abc = 93827;
        Integer result = Integer.valueOf(new StringBuilder(Integer.toString(abc)).reverse().toString());
        System.out.println(result);
    }
}
