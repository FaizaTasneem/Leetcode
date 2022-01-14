public class Solution {
    public static void main(String[] args) {
        int [] a = {1};
        System.out.println(singleNumber(a));
    }
    public static int singleNumber(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int c=0;
            for(int j=0; j<nums.length; j++){
                if(i!=j && nums[i]==nums[j]){
                    c++;
                    break;
                }
            }
            if(c==0){
                return nums[i];
            }
        }
        return 0;
    }
}
