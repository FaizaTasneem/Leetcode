import java.util.Arrays;
public class Solution {
    public static void main(String[] args) {
        int [] a = {1};
        int [] b = {};
        merge(a,1,b,0);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        for(int i=m; i<m+n; i++){
            nums1[i]=nums2[j];
            j++;
        }
        Arrays.sort(nums1);
        for(int i=0; i<nums1.length; i++){
            System.out.print(nums1[i]+" ");
        }
    }
}
