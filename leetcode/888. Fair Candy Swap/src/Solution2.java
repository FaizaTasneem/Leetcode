public class Solution2 {
    public static void main(String[] args) {
        int [] a = {1,2,5};
        int [] b = {2,4};
        int [] c = fairCandySwap(a,b);
        for(int i=0; i<c.length; i++){
            System.out.print(c[i]+" ");
        }
    }
    public static int[] fairCandySwap(int[] A, int[] B) {
        int[] a = new int[2];
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < A.length; i++) {
            sum1 = sum1 + A[i];
        }
        for (int i = 0; i < B.length; i++) {
            sum2 = sum2 + B[i];
        }

        for(int j=0; j<B.length; j++){
            for(int i=0; i<A.length; i++){
                if(sum1-A[i]+B[j]==sum2-B[j]+A[i]){
                    a[0]=A[i];
                    a[1]=B[j];
                    return a;
                }
            }
        }
        return a;
    }
}
