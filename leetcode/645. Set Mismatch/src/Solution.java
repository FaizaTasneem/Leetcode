import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int [] a = {1,1};
        int [] b = findErrorNums(a);
        for(int i=0; i<b.length; i++){
            System.out.print(b[i]+" ");
        }
    }
    public static int[] findErrorNums(int[] nums) {
        int [] a = new int[2];
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                a[0]=nums[i];
                break;
            }
        }
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=nums[i]+1){
                a[1]=nums[i]+1;
            }
        }
        return a;
    }
}
