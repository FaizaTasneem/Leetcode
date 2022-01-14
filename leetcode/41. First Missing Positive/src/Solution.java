import java.util.Arrays;
public class Solution {
    public static void main(String[] args) {
        int [] a = {-7,0,2,3};
        System.out.println(missingpositive(a));
    }

    public static int missingpositive(int[] nums){
        Arrays.sort(nums);
        int c=1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>c){
                return c;
            }
            else if(nums[i]==c){
                c++;
            }
        }
        return c;
    }
}
