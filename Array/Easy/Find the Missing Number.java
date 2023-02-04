//User function Template for Java


class Compute {
    
    public static int missingNumber(int A[], int N)
    {
         // Your code goes here
         //using sum formula 
         
         int sum=(N*(N+1))/2;
         
         int sumarr=0;
         for(int i=0; i <N ;i++){
             sumarr= sumarr+A[i];
         }
         return sum-sumarr;
    }
}
