public class Solution {
    public static boolean search(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int [] a = {2,5,6,0,0,1,2};
        System.out.println(search(a,0));
        int x = (int)Math.sqrt(8);
        System.out.println(x);
    }
}
