public class Solution {
    public static int findMin(int[] nums) {
        int min = nums[0];
        for(int i=0; i<nums.length; i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int [] a = {11,13,15,17};
        System.out.println(findMin(a));
    }
}
