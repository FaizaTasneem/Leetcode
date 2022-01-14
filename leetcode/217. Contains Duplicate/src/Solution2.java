import java.util.Arrays;
public class Solution2 {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=nums.length-1; i>=0; i--){
            if(i!=Arrays.binarySearch(nums,nums[i])){
                return true;
            }
        }
        //System.out.println(Arrays.binarySearch(nums,22));
        return false;
    }

    public static void main(String[] args) {
        int [] a = {2,14,18,22,22};
        int [] b = {1,2,3,4};
        int [] c = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(c));
    }
}
