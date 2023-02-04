class Solution {
    public int singleNumber(int[] nums) {
        // using XOR

        int single=nums[0];

        for(int i=1;i<nums.length ;i++){
            single=single^nums[i];
        }
        return single;
    }
}
