class Solution {
    public void setZeroes(int[][] matrix) {
        boolean []row=new boolean[matrix.length];
        boolean[] column= new boolean[matrix[0].length];


        //for traversing the matrix 
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    //mark row and column =1
                    row[i] = column[j] = true;
                }
            }
            }
        // Finally, mark all (i, j) as 0
        // if row[i] or col[j] is marked with 1.

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if (matrix[i][j] != 0)
                    matrix[i][j] = row[i] || column[j] ? 0 : matrix[i][j];
            }
        }
       

        }
    }



