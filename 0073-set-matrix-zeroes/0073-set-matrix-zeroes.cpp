class Solution {
public:
   void setZeroes(vector < vector < int >> & matrix) {
       int R = matrix.size();
       int C = matrix[0].size();
       
       bool firstRow = false;
       bool firstCol = false;
       //first row
       for(int j=0; j < C; j++){
           if(matrix[0][j] == 0){
               firstRow = true;
           }
       }
       //first column
       for(int i=0; i < R; i++){
           if(matrix[i][0] == 0){
               firstCol = true;
           }
       }
       
       for(int i= 1; i < R;  i++){
           for(int j=1; j < C ; j++){
            if(matrix[i][j] == 0){
                //mark first row and first col 0
                matrix[i][0] = 0;
                matrix[0][j] = 0;
            }   
           }
       }
       //marking zero for rows
       for(int i=1; i < R; i++){
           if(matrix[i][0] == 0){
               for(int j = 0; j < C; j++){
                   matrix[i][j] = 0;
               }
           }
       }
       //marking zero for columns
       for(int j=1; j < C; j++){
           if(matrix[0][j] == 0){
               for(int i=0; i < R ; i++){
                   matrix[i][j] = 0;
               }
           }
       }
       if(firstRow){
           for(int j=0; j < C;  j++){
               matrix[0][j] = 0; 
           }
       }
       if(firstCol){
           for(int i=0; i < R;  i++){
               matrix[i][0] = 0; 
           }
       }
       
    }
};