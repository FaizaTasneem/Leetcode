import java.util.Arrays;

public class Solution {
    public static int[] sortedSquares(int[] nums) {
        for(int i=0; i<nums.length; i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        int[] a = {-4,-1,0,3,10};
        int[] b = sortedSquares(a);
        for(int i=0; i<a.length; i++){
            System.out.print(b[i]+" ");
        }
    }
}
