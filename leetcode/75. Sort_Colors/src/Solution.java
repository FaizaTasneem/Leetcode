public class Solution {
    public static void sortColors(int[] nums) {
        int temp;
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[j]<nums[i]){
                    temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                }
            }
        }
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }

    public static void main(String[] args) {
        int [] a = {1};
        sortColors(a);
    }
}
