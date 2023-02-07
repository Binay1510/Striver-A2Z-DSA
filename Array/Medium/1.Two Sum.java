// apprach 1-----brute force Let, first Element is x. The required second element will be, target – x
//--------------If we find both the elements, we break the loop and return the indices.


class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(target== nums[i]+nums[j]){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}


//approach 2-  using hashtable

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[]=new int[2];
        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                result[1]=i;
                result[0]=map.get(target-nums[i]);
                return result;
            }
            map.put(nums[i],i); 
        
    }
    return result;
    }
}
