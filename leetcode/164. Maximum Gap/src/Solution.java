public class Solution {
    public static int maximumGap(int[] nums) {
        if(nums.length<2){
            return 0;
        }

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
        int[] a = new int[nums.length-1];
        for(int i=0; i<nums.length-1; i++){
            a[i]=nums[i+1]-nums[i];
            //System.out.println(a[i]);
        }

        int largest = a[0];
        //System.out.println(largest);
        for(int i=1; i<a.length; i++){
            if(a[i]>largest){
                largest=a[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] a = {3,6,9,1};
        int[] b = {10};
        int[] c = {1,10000000};
        System.out.println(maximumGap(c));
    }
}
