public class Solution {
    public static void moveZeroes(int[] nums) {
        int temp = 0;
        int count = 0;

        for(int i=0; i<nums.length-1; i++){
            int j=i+1;
            if(nums[i]==0){
                while(nums[j]==0 && j<nums.length){
                    j++;
                    if(j==nums.length){
                        j--;
                        break;
                    }
                }
                temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] a = {0,1,0,3,12};
        moveZeroes(a);
    }
}
