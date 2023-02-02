class Solution {
    public void moveZeroes(int[] nums) {
        // find first zero element
        int k=0;
        while(k<nums.length){
            if(nums[k]==0){
                break;
            }
            else{
                k=k+1;
            }
        }
        //finding all zeros and intermediate non zero and swapping them
        int i=k;
        int j=k+1;
        while(i<nums.length && j<nums.length){
            if(nums[j]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
            j++;
        }
    }
}
