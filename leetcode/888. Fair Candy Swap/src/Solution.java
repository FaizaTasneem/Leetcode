public class Solution {
    public static void main(String[] args) {
        int [] a = {2};
        int [] b = {1,3};
        int [] c = fairCandySwap(a,b);
        for(int i=0; i<c.length; i++){
            System.out.print(c[i]+" ");
        }
    }
    public static int[] fairCandySwap(int[] A, int[] B) {
        int [] a = new int[2];
        for(int j=0; j<B.length; j++){
            for(int i=0; i<A.length; i++){
                if(SumEqualAfterSwap(A,B,i,j)==true){
                    a[0]=A[i];
                    a[1]=B[j];
                    return a;
                }
            }
        }
        return a;
    }

    public static boolean SumEqualAfterSwap(int[] a, int[] b,int c, int d){
        int sum1=0;
        int sum2=0;

        for(int i=0; i<a.length; i++){
            if(i==c){
                sum1=sum1+b[d];
            }
            else{
                sum1=sum1+a[i];
            }
        }

        for(int i=0; i<b.length; i++){
            if(i==d){
                sum2=sum2+a[c];
            }
            else{
                sum2=sum2+b[i];
            }
        }

        if(sum1==sum2){
            System.out.println(sum1);
            System.out.println(sum2);
            return true;
        }
        return false;
    }

}
