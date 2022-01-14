public class Solution {
    public static void rotate(int[] nums, int k) {
        int [] a = new int[nums.length];
        int j=k;

        for(int i=0; i<nums.length; i++){
            if(k>=nums.length){
                j = j%nums.length;
                a[j]=nums[i];
            }
            else{
                a[j]=nums[i];
            }
            j=(j+1)%nums.length;;
        }

        for(int i=0; i<a.length; i++){
            nums[i]=a[i];
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7};
        int [] b = {1,2};
        rotate(b,2);
    }
}
