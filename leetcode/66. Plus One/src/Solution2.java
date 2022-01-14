import java.math.BigDecimal;
public class Solution2 {
    public static int[] plusOne(int[] digits) {
        if(digits[0]==0){
            digits[digits.length-1]=digits[digits.length-1]+1;
            return digits;
        }
        String s1 = "";
        String s2 = "1";
        for(int i=0; i<digits.length; i++){
            s1=s1+String.valueOf(digits[i]);
        }
        BigDecimal a = new BigDecimal(s1);
        BigDecimal b = new BigDecimal(s2);
        BigDecimal n = a.add(b);
        String s = String.valueOf(n);
        char [] c = new char [s.length()];
        for(int i=0; i<c.length; i++){
            c[i]=s.charAt(i);
        }
        int [] x = new int[c.length];
        for(int i=0; i<x.length; i++){
            x[i]=Character.getNumericValue(c[i]);
        }
        return x;
    }
    public static void main(String[] args) {
        int [] a = {9,8,7,6,5,4,3,2,1,9};
        int [] c = {8,9,9};
        int [] d = {1,2,9};
        int [] e = {0,0};
        int [] b = plusOne(e);
        for(int i=0; i<b.length; i++){
            System.out.print(b[i]+" ");
        }
    }
}
