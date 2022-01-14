public class Solution {
    public static int[] plusOne(int[] digits) {
        int c=digits.length;
        int[] a = new int [c];
        if(digits[0]<9){
            int j = digits.length-1;
            for(int i=a.length-1; i>=0; i--) {
                a[i] = digits[j];
                System.out.println(a[i]);
                j--;
            }
        }
        else {
            a = new int [c+1];
            int j = digits.length-1;
            for(int i=a.length-1; i>=1; i--) {
                a[i] = digits[j];
                System.out.println(a[i]);
                j--;
            }
        }

        a[a.length-1]=a[a.length-1]+1;
        if(digits[0]<9 && a[a.length-1]%10==0){
            for(int i=a.length-1; i>0; i--){
                if(a[i]%10==0){
                    a[i]=0;
                    a[i-1]=a[i-1]+1;
                }
            }
        }
        else if(digits[0]==9 && a[a.length-1]%10==0){
            for(int i=a.length-1; i>0; i--){
                if(a[i]%10==0){
                    a[i]=0;
                    a[i-1]=a[i-1]+1;
                }
            }
            return a;
        }
        return a;
    }

    public static void main(String[] args) {
        int [] a = {9,8,7,6,5,4,3,2,1,9};
        int [] c = {8,9,9};
        int [] d = {1,2,9};
        int [] e = {9};
        int [] b = plusOne(a);
        for(int i=0; i<b.length; i++){
            System.out.print(b[i]+" ");
        }
    }
}
