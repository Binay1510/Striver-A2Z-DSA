Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

class Solution {
    public int majorityElement(int[] nums) {
        int majorityElement=nums.length/2;

        for(int num:nums){
            int count=0;
            for(int element: nums){
                if(element==num){
                    count+=1;
                }
            }
            if(count>majorityElement){
                return num;
            }
        }
        return -1;
    }
}


       //MOORE VOTING ALGORTIHM
class Solution {
    public int majorityElement(int[] nums) {

        int count=0;
        int element=0;

        for(int num:nums){
            if(count==0){
                element=num;
            }
            if(element==num){
                count+=1;
            }
            else{
                count-=1;
            }
        }
        return element;
    }
}
