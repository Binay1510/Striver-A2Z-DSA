//better -USING SORTING
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int lastsmall=Integer.MIN_VALUE;
        int longest=1;
        int count=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]-1==lastsmall){
                count+=1;
                lastsmall=nums[i];
            }
            else if(lastsmall!=nums[i]){
                count=1;
                lastsmall=nums[i];
            }
            longest=Math.max(longest,count);
        }
return longest;
       
    }
}


//Optimal - HASH SET
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> num_set = new HashSet<Integer>();
        for (int num : nums) {
            num_set.add(num);
        }

        int longestStreak = 0;

        for (int num : num_set) {
            if (!num_set.contains(num-1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (num_set.contains(currentNum+1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
