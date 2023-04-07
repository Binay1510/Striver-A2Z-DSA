class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int index=0;
        int i=0;
        for( i=n-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                index=i;
                break;
            }
        }
        if(index>0){
            while(index<n && nums[index]>nums[i-1]){
                index++;
            }
            index=index-1;
            int temp =nums[i-1];
            nums[i-1]=nums[index];
            nums[index]=temp;
            Arrays.sort(nums,i,n);
        }
        else{
            Arrays.sort(nums);
        }
        
    }
}
