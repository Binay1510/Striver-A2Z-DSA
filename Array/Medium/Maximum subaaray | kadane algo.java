class Solution {
    public int maxSubArray(int[] nums) {
       int sums=0;
       int max=nums[0];
       for(int i=0;i<nums.length;i++){
           sums+=nums[i];
           if(max<sums) max=sums;
           if(sums<0) sums=0; 
       }
       return max;
    }
}
