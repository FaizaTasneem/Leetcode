public class Solution {
    public static void main(String[] args) {
        int [] a = {9,6,4,2,3,5,7,0,1};
        int [] b = {3,0,1};
        int [] c = {0};
        System.out.println(missingNumber(c));
    }
    public static int missingNumber(int[] nums) {
        int c=0;

        while(c<=nums.length){
            int x=0;
            for(int i=0; i<nums.length; i++){
                if(c==nums[i]){
                    x++;
                    break;
                }
            }
            if(x==0){
                return c;
            }
            c++;
        }
        return c;
    }
}
