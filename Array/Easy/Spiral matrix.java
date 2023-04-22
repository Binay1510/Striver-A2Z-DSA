// This question has only one solution i.e optimal solution 
// thus asked in interviews to test your implemantation and how clean you can write the code
// right-> bottom->left-> top

//RUNTIME ERROR 

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> ans =new ArrayList<>();

        //int n=matrix.length;
        //int m=matrix[0].length;

        int top=0 ,left=0, right=matrix[0].length-1,bottom=matrix.length-1;

        while(top<=bottom && left<=right){

            //moving right ->left in top section
            for(int i=left;i<=right ;i++){
                ans.add(matrix[top][i]);
                top++;
            }

            //moving top->bottom

            for(int i=0; i<=bottom ;i++){
                ans.add(matrix[i][right]);

                right--;
            }

            //right->left

            if(top<=bottom){
                for(int i=right; i<=left ;i--){
                    ans.add(matrix[bottom][i]);

                
            }
            bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    ans.add(matrix[i][left]);

                
            }
            left++;
        }

        return ans;
        }

    }
