//Aproach 1 brute force -----creating a temp array and storing eleemtns in it

class Solution {
    public void rotate(int[] nums, int k) {
        int n= nums.length;
        if(n==0)
            return ;
        k = k % n;
        if(k>n)
            return ;    
        
        int temp[]=new int[n];
        for(int i=n-k;i<n;i++){
            temp[i-n+k]=nums[i];

        }
        for(int i=n-k-1; i>=0;i--){
            temp[i+k]= nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=temp[i];
        }
        //return nums[];
    }
}




//apprach 2- using reverse algorithm
//1.) ----reverse last k elements 
//2.--------reveerse first n-k elemets
//3. --------reverse whole array


class Solution {
    public void rotate(int[] nums, int k) {
       
        k=k%nums.length;


        //reverse last k elements 
        Reverse(nums,nums.length-k,nums.length-1);
        //reverse first n-k eleemtns
        Reverse(nums,0,nums.length-k-1);
        //reverse whole array
        Reverse(nums,0,nums.length-1);
    }
    //function to reverse array
        public static void Reverse(int[]nums , int start, int end){
            while(start<end){
                int temp= nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }

        }
}
