class Solution {
    int isPalindrome(String S) {
        // code here
        
        
        for(int i=0; i<S.length()/2; i++){
            int j=S.length()-i-1;
            if(S.charAt(i) != S.charAt(j)){
                return 0;
            }
        }
        return 1;
    }
};
