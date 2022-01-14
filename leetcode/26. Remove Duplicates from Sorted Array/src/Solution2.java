public class Solution2 {
    public static int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int c=0;
        for(int i=1; i<nums.length; i++){
            if(nums[c]!=nums[i]){
                nums[c+1]=nums[i];
                c++;
            }
        }
        int len = c+1;
        for(int i=0; i<len; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        return len;
    }

    public static void main(String[] args) {
        int [] a = {1,1,2,3,3,4,4,4,6,6};
        int [] b = {0,0,1,1,1,2,2,3,3,4};
        int [] c = {2,2,2,2,2};
        System.out.println(removeDuplicates(c));
    }
}
