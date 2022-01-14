public class Solution {
    public static int[] searchRange(int[] nums, int target) {
        int [] a = {-1,-1};

        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                a[0]=i;
                int c=i;
                while(nums[c]==target){
                    c++;
                    if(c==nums.length){
                        break;
                    }
                }
                a[1]=c-1;
                return a;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int [] a = {5,7,7,8,8,8,8,10};
        int [] c = {1};
        int [] b = searchRange(c,1);
        for(int i=0; i<b.length; i++){
            System.out.print(b[i]+" ");
        }

    }
}
