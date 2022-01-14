import java.util.Arrays;

public class Solution {
    public static int[] sortArray(int[] nums) {
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        int [] a = {5,2,3,1};
        int [] b = sortArray(a);
        for(int i=0; i<b.length; i++){
            System.out.print(b[i]+" ");
        }
    }
}
