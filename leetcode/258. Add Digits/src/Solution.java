import java.util.*;

public class Solution {
    public static int addDigits(int num) {
        int a = recursion(num);

        return a;
    }
    public static int recursion(int num){
        int a = 0;
        Stack<Integer> stack = new Stack<Integer>();
        while (num > 0) {
            stack.add( num % 10 );
            num = num / 10;
        }
        while (!stack.isEmpty()) {
            a=a+stack.pop();
        }
        if (a>9){
            a=recursion(a);
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println(addDigits(199));
    }
}
