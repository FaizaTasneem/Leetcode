public class Solution {
    public static void main(String[] args) {
        int [] a = {0,1,2,2,3,0,4,2};
        //removeElement(a,2);

        System.out.println(removeElement(a,2));
    }
    public static int removeElement(int[] nums, int val) {
        int temp = 0;
        int count = 0;

        for(int i=0; i<nums.length-1; i++){
            int j=i+1;
            if(nums[i]==val){
                while(nums[j]==val && j<nums.length){
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
            if(nums[i]!=val){
                count++;
            }
        }

        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        return count;
    }

}
