// approach  1- using linear search

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int m=0;m<matrix.length;m++){
            for(int n=0; n<matrix[m].length;n++){
                if(matrix[m][n]== target){
                    return true;
                }

            }
        }
        return false;
    }
}



// approach 2- binary - will do afterwords 

